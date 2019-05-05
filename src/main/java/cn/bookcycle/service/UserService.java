package cn.bookcycle.service;

import cn.bookcycle.pojo.User;

/**
 * @author yesyoungbaby
 * @Title: UserService
 * @ProjectName app-access
 * @Description: TODO
 * @date 2018/11/3021:54
 */
public interface UserService {

    /**
     * 用id查用户
     * @param id
     * @return
     */
    User queryById(Long id);
}
