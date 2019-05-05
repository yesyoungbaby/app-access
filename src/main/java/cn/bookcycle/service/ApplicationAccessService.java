package cn.bookcycle.service;

import cn.bookcycle.common.PageResult;
import cn.bookcycle.pojo.ApplicationAccess;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author yesyoungbaby
 * @Title: ApplicationAccessService
 * @ProjectName app-access
 * @Description: TODO
 * @date 2018/11/2810:38
 */
public interface ApplicationAccessService {
    /**
     * 新增用户
     */
    int addAppAccess(ApplicationAccess applicationAccess);

    /**
     * 添加时的参数判断
     */
    int checkData(String param);

    /**
     *  按主键删应用，真实删除
     */
    int deleteAppAccessById(Long id);

    /**
     * 按主键软删应用
     */
    int deleteAppAccess(Long id);

    /**
     * 改
     */
    int updateAppAccessById(ApplicationAccess applicationAccess);


    /**
     * 查找应用
     */
    ApplicationAccess queryById(Long id);//没用到
    ApplicationAccess queryByName(String name);//没用到
    PageResult queryByNameLike(String name,long userId);
    List<ApplicationAccess> querySome(int pageNum, int pageSize);//没用到
    PageResult querySomeEnhance(int pageNum, int pageSize,long userId);
}
