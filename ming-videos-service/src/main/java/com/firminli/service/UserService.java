package com.firminli.service;

import com.firminli.pojo.Users;

public interface UserService {

    /**
     * 判断用户名是否存在
     *
     * @param username 用户名
     * @return
     */
    boolean queryUsernameIsExist(String username);

    /**
     * 保存用户（用户注册）
     *
     * @param user 注册时用户的信息
     */
    void saveUser(Users user);
}
