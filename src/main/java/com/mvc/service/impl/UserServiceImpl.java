package com.mvc.service.impl;

import com.mvc.entity.User;
import com.mvc.mapper.UserMapper;
import com.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CJS
 * @description
 * @date 19/10/12 14:33
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * @param user 用户对象
     * @return com.mvc.entity.User
     * @author CJS
     * @description 用户登录
     * @date 10:34 19/10/15
     */
    public User findUser(User user) {
        return userMapper.findUser(user);
    }

    /**
     * @param id    用户id
     * @param token 用户token
     * @return void
     * @author CJS
     * @description 保存用户token
     * @date 10:41 19/10/15
     */
    public void saveToken(Integer id, String token) {
        userMapper.saveToken(id, token);
    }
}
