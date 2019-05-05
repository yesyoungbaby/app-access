package cn.bookcycle.controller;

import cn.bookcycle.common.PageResult;
import cn.bookcycle.common.ResponseResult;
import cn.bookcycle.pojo.ApplicationAccess;
import cn.bookcycle.service.ApplicationAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author yesyoungbaby
 * @Title: ApplicationAccessController
 * @ProjectName app-access
 * @Description: TODO
 * @date 2018/11/2811:45
 */
@RestController
public class ApplicationAccessController {
    @Autowired
    private ApplicationAccessService applicationAccessService;

    /**
     * 按id精确查找
     * @param id
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/application_access/applicationAccess/{id}")
    public ResponseResult queryById(@PathVariable("id") Long id){
        ApplicationAccess applicationAccess = applicationAccessService.queryById(id);
        if(applicationAccess != null){
            return ResponseResult.build(200,"查找成功",applicationAccess);
        }else {
            return ResponseResult.build(401,"没有该对象",null);
        }


    }

    /**
     * 按名精确查找
     * @param name
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/application_access/applicationAccess/{name}")
    public ResponseResult queryByName(@PathVariable("name") String name){
        ApplicationAccess applicationAccess = applicationAccessService.queryByName(name);
        if(applicationAccess != null){
            return ResponseResult.build(200,"查找成功",applicationAccess);
        }else {
            return ResponseResult.build(401,"没有该对象",null);
        }
    }

    /**
     * 按名模糊查询   也返回记录总数
     * @param name
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/application_access/applicationAccess/name/like")
    public ResponseResult queryLikeByName(@RequestParam("name") String name,
                                          HttpSession session){
        Long userId = (Long) session.getAttribute("userId");
        PageResult result = applicationAccessService.queryByNameLike(name,userId);
        if(result != null){
            return ResponseResult.build(200,"查找成功",result);
        }else {
            return ResponseResult.build(401,"没有该对象",null);
        }
    }

    /**
     * 第一版本的分页查询，没有返回查询到的总记录数
     * @param pageNum
     * @param pageSize
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/application_access/applicationAccess/page")
    public ResponseResult querySome(Integer pageNum, Integer pageSize){

        if(pageNum == null || pageSize ==null){
            return ResponseResult.build(402,"请求参数格式错误");
        }
        List<ApplicationAccess> list = applicationAccessService.querySome(pageNum,pageSize);
        if(list != null){
            return ResponseResult.build(200,"分页查找成功",list);
        }else {
            return ResponseResult.build(403,"分页查找失败",null);
        }
    }

    /**
     * 返回总记录数和记录list
     *
     * 要搞清楚 int Integer 拆装箱
     *
     * @param pageNum    当前页
     * @param pageSize  单页记录数
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/application_access/applicationAccess/page/enhance")
    public ResponseResult querySomeEnhance(@RequestParam(value = "pageNum",defaultValue = "1") String pageNum,
                                           @RequestParam(value = "pageSize",defaultValue = "5") String pageSize,
                                           HttpSession session){
        try{
            int num = Integer.parseInt(pageNum);
            int size = Integer.parseInt(pageSize);

            Long userId = (Long) session.getAttribute("userId");

            PageResult result = applicationAccessService.querySomeEnhance(num,size,userId);
            if(result != null){
                return ResponseResult.build(200,"分页查找成功",result);
            }else {
                return ResponseResult.build(403,"分页查找失败",null);
            }
        }catch (Exception e){
            return ResponseResult.build(401,"请求参数格式错误");
        }




    }

    /**
     * 新增应用
     * produces = {"application/json;charset=UTF-8"} 指定返回值类型 以及编码格式
     * @param applicationAccess  实际传入的是该对象的一些字段
     * @return
     */
    @CrossOrigin
    @PostMapping(value = "/application_access/applicationAccess/add",produces = {"application/json;charset=UTF-8"})
    public ResponseResult addOne(ApplicationAccess applicationAccess){
        int status = applicationAccessService.addAppAccess(applicationAccess);
        ResponseResult result = new ResponseResult();
        if (status == 1){
            result =  ResponseResult.build(200,"添加成功");
        }
        if(status == 0){
            result =  ResponseResult.build(405,"添加失败");
        }
        if(status == 4001){
            result =  ResponseResult.build(4001,"应用名称不能为空");
        }
        if (status == 4003){
            result = ResponseResult.build(4003,"该应用名称已经存在，请重新命名");
        }
        return result;
    }

    /**
     * 从db中删除
     * @param id
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/application_access/applicationAccess/delete")
    public ResponseResult deleteById(Long id){
        int status = applicationAccessService.deleteAppAccessById(id);
        if (status == 1){
            return ResponseResult.build(200,"删除成功");
        }else {
            return ResponseResult.build(407,"删除失败");
        }
    }

    /**
     * 应用状态置为0的删除
     * @param id
     * @return
     */
    @CrossOrigin
    @PostMapping(value = "/application_access/applicationAccess/deleteVirtually")
    public ResponseResult delete(Long id){
        int result = applicationAccessService.deleteAppAccess(id);
        if(result == 1){
            return ResponseResult.build(200,"删除成功");
        }else {
            return ResponseResult.build(407,"删除失败");
        }
    }


    /**
     *
     * @param applicationAccess 要更新的对象。前台传过来的可能是一些字段，按形参的名字与app的字段自动匹配
     * @param id app_access_id是前端传的要更新的对象的id。用于指明要更新哪个对象
     * @return
     */
    @CrossOrigin
    @PostMapping(value = "/application_access/applicationAccess/update",produces = {"application/json;charset=UTF-8"})
    public ResponseResult updateById(ApplicationAccess applicationAccess,
                                     @RequestParam("app_access_id") Long id){

        /**
         * 前台传来的究竟是什么？
         */
        applicationAccess.setId(id);
        int result = applicationAccessService.updateAppAccessById(applicationAccess);
        if(result == 1){
            return ResponseResult.build(200,"更新成功",applicationAccess);
        }else {
            return ResponseResult.build(408,"更新失败",null);
        }
    }

}
