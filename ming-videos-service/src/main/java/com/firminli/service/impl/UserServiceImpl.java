package com.firminli.service.impl;

import com.firminli.mapper.UsersMapper;
import com.firminli.pojo.Users;
import com.firminli.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper userMapper;

    @Autowired
    private Sid sid;

    /**
     * 查询用户名是否存在
     *
     * @param username 用户名
     * @return false - 不存在， true - 存在
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean queryUsernameIsExist(String username) {

        Users user = new Users();
        user.setUsername(username);

        Users result = userMapper.selectOne(user);

        return result == null ? false : true;
    }

    /**
     * 保存用户（注册用户）
     * @param user 注册时用户的信息
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveUser(Users user) {

        String userId = sid.nextShort();
        user.setId(userId);
        userMapper.insert(user);
    }
}
