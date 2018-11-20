package com.yl.service;

import com.yl.pojo.User;

/**
 * @author 杨黎
 * @Title   UserService
 * @description 对用户操作的service
 * @DATE 2018/11/9  13:27
 */
public interface UserService {

    /**
     * 新建一个用户
     * @param user
     */
    void createUser(User user);

    /**
     * 根据id删除一个用户
     * @param id    用户id
     */
    void deleteUserByUsername(Long id);

    /**
     * 获取用户总量
     * @return
     */
    Integer getAllUsers();


}
