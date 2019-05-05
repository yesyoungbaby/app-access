package cn.bookcycle.service.impl;

import cn.bookcycle.mapper.UserMapper;
import cn.bookcycle.pojo.User;
import cn.bookcycle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author yesyoungbaby
 * @Title: UserServiceImpl
 * @ProjectName app-access
 * @Description: TODO
 * @date 2018/11/3021:54
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
