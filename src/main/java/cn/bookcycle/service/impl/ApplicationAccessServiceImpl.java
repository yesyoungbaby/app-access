package cn.bookcycle.service.impl;

import cn.bookcycle.common.PageResult;
import cn.bookcycle.common.SecretProducer;
import cn.bookcycle.mapper.ApplicationAccessMapper;
import cn.bookcycle.pojo.ApplicationAccess;
import cn.bookcycle.pojo.ApplicationAccessExample;
import cn.bookcycle.service.ApplicationAccessService;
import cn.bookcycle.utils.UserUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author yesyoungbaby
 * @Title: ApplicationAccessServiceImpl
 * @ProjectName app-access
 * @Description: TODO
 * @date 2018/11/2810:38
 */
@Service(value = "applicationAccessService")
public class ApplicationAccessServiceImpl implements ApplicationAccessService {

    @Autowired
    private ApplicationAccessMapper applicationAccessMapper;

    @Override
    public int addAppAccess(ApplicationAccess applicationAccess) {//, HttpSession session

/*        if (session == null || session.getAttribute("userId") == null){
            return 0;
        }
        String uid = (String) session.getAttribute("userId");*/
//        applicationAccess.setUserId(Long.parseLong(uid));//可能有多个User是超管。这时候需要将userId设值

        /**
         * 添加应用时增加应用名称重复的判断
         */
        int result;
        int nothing = 4001;
        int right = 4002;
        int wrong = 4003;
        result = checkData(applicationAccess.getName());
        if (result == nothing) {
            return 4001;
        }
        if (result == wrong) {
            return 4003;
        }
        if (result == right) {
            applicationAccess.setCreateTime(new Date());
            applicationAccess.setUpdateTime(new Date());
            applicationAccess.setAppId(SecretProducer.proAppId());
            applicationAccess.setAppSecret(SecretProducer.proSecretKey());
            applicationAccess.setState((short) 1);
            result =  applicationAccessMapper.insert(applicationAccess);
        }

        return result;
    }

    @Override
    public int checkData(String param) {

        /**
         * 参数不能为空
         */
        if (param == null || param.equals("")){
            return 4001;
        }

        ApplicationAccessExample example = new ApplicationAccessExample();
        ApplicationAccessExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(param);

        List<ApplicationAccess> list = applicationAccessMapper.selectByExample(example);
        /**
         * 4002代表没有信息重复
         */
        if(list == null || list.size() == 0){
            return 4002;
        }else {
            return 4003;
        }

    }

    /**
     *
     * db中删记录
     * @param id
     * @return
     */
    @Override
    public int deleteAppAccessById(Long id) {
        return applicationAccessMapper.deleteByPrimaryKey(id);

        //按条件删除
    }

    /**
     * 删除的逻辑变成对象状态置为0
     * 所以查询到的数据只能是返回状态为1的对象
     * @param id
     * @return
     */
    @Override
    public int deleteAppAccess(Long id) {

        ApplicationAccess applicationAccess = applicationAccessMapper.selectByPrimaryKey(id);
        applicationAccess.setState((short)0);
        int result = applicationAccessMapper.updateByPrimaryKeySelective(applicationAccess);
        return result;
    }


    @Override
    public int updateAppAccessById(ApplicationAccess applicationAccess) {
        int result = applicationAccessMapper.updateByPrimaryKeySelective(applicationAccess);
        return result;
    }

    @Override
    public ApplicationAccess queryById(Long id) {

       //按条件查
        ApplicationAccessExample example = new ApplicationAccessExample();
        ApplicationAccessExample.Criteria  criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStateEqualTo((short) 1);
        List<ApplicationAccess> list = applicationAccessMapper.selectByExample(example);
        if(list != null && list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }

    /**
     * 由名字的精确查找
     * @param name
     * @return
     */
    @Override
    public ApplicationAccess queryByName(String name) {

        ApplicationAccessExample example = new ApplicationAccessExample();
        ApplicationAccessExample.Criteria  criteria = example.createCriteria();

        if(name != null && !"".equals(name) ){
            criteria.andNameEqualTo(name);
            criteria.andStateEqualTo((short) 1);
        }else {
            return null;
        }

        List<ApplicationAccess> list = applicationAccessMapper.selectByExample(example);
        if(list != null && list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }


    /**
     * 实现按名字查找的模糊查询  有多条数据返回，所以也返回查询到的总记录数
     * @param name
     * @return
     */
    @Override
    public PageResult queryByNameLike(String name,long userId) {

        ApplicationAccessExample example = new ApplicationAccessExample();
        ApplicationAccessExample.Criteria  criteria = example.createCriteria();

        if(name != null && !"".equals(name) ){
            criteria.andNameLike("%"+name+"%");
            criteria.andStateEqualTo((short) 1);

            /**
             * 非超管，不能查看所有数据。只能看到当前管理员创建的应用数据
             */
            if (userId != 1L){
                criteria.andUserIdEqualTo(userId);
            }

        }else {
            return null;
        }

        List<ApplicationAccess> list = applicationAccessMapper.selectByExample(example);
        if(list != null && list.size()>0){
            PageInfo<ApplicationAccess> pageInfo = new PageInfo<>(list);
            long total = pageInfo.getTotal();
            PageResult result = new PageResult();
            result.setTotalNum(total);
            result.setRecords(list);
            return result;
        }else {
            return null;
        }
    }

    /**
     * 这个方法中用到了配置依赖的分页插件pagehelper
     * 只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     */
    @Override
    public List<ApplicationAccess> querySome(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页
        PageHelper.startPage(pageNum, pageSize);
        ApplicationAccessExample example = new ApplicationAccessExample();
        ApplicationAccessExample.Criteria  criteria = example.createCriteria();
        criteria.andStateEqualTo((short) 1);
        List<ApplicationAccess> result = applicationAccessMapper.selectByExample(example);
        return result;
    }

    /**
     *  页面查询的增强版
     *  返回包括总记录数  要查询的
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageResult querySomeEnhance(int pageNum, int pageSize,long userId) {

        PageHelper.startPage(pageNum, pageSize);
        ApplicationAccessExample example = new ApplicationAccessExample();
        ApplicationAccessExample.Criteria  criteria = example.createCriteria();
        criteria.andStateEqualTo((short) 1);

        /**
         * 非超管，不能查看所有数据。只能看到当前管理员创建的应用数据
         */
        if (userId != 1L){
            criteria.andUserIdEqualTo(userId);
        }
        List<ApplicationAccess> list = applicationAccessMapper.selectByExample(example);
        if( list != null && list.size()>0){
            PageInfo<ApplicationAccess> pageInfo = new PageInfo<>(list);

            /**
             这个总记录数是分页查询的总记录数？？？还是数据库中的记录总数？？？用模糊查询来验证一下
             验证过了 返回的是前者
             */
            //记录总数
            long totalNum = pageInfo.getTotal();
            long totalPage;
            if(totalNum % pageSize != 0){
                totalPage = totalNum / pageSize +1;
            }else {
                totalPage = totalNum / pageSize;
            }
            PageResult result = new PageResult();
            result.setTotalNum(totalNum);
            result.setRecords(list);
            result.setTotalPage(totalPage);
            return result;
        }else {
            return null;
        }
    }
}
