package com.mvc.service;

import com.mvc.entity.User;

/**
 * @author CJS
 * @description
 * @date 19/10/12 14:31
 */
public interface UserService {

    /**
     * @param user 用户对象
     * @return com.mvc.entity.User
     * @author CJS
     * @description 用户登录
     * @date 10:34 19/10/15
     */
    User findUser(User user);

    /**
     * @param id    用户id
     * @param token 用户token
     * @return void
     * @author CJS
     * @description 保存用户token
     * @date 10:41 19/10/15
     */
    void saveToken(Integer id, String token);

}
