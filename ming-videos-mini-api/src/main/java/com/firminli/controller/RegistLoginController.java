package com.firminli.controller;

import com.firminli.pojo.Users;
import com.firminli.service.UserService;
import com.firminli.utils.JSONResult;
import com.firminli.utils.MD5Utils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistLoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/regist")
    public JSONResult regist(@RequestBody Users user) throws Exception {

        // 1. 判断用户名密码不能为空
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword()))
            return JSONResult.errorMsg("用户名或密码不能为空");

        // 2. 判断用户名是否存在
        boolean usernameIsExist = userService.queryUsernameIsExist(user.getUsername());

        // 3. 保存用户，注册信息
        if (!usernameIsExist) {
            user.setNickname(user.getUsername());
            user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
            user.setFansCounts(0);
            user.setReceiveLikeCounts(0);
            user.setFollowCounts(0);
            userService.saveUser(user);
        } else  {
            return JSONResult.errorMsg("用户名已经存在了哟~请换一个试试吧");
        }

        return JSONResult.ok();
    }

}
