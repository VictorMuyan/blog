package com.luo.blog.service.impl;

import com.luo.blog.dao.AdminUserMapper;
import com.luo.blog.entity.AdminUser;
import com.luo.blog.service.AdminUserService;
import com.luo.blog.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String userName, String password) {
        String s = MD5Util.MD5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, s);
    }

    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return adminUserMapper.selectByPrimaryKey(loginUserId);
    }

    @Override
    public Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            String temp1 = MD5Util.MD5Encode(originalPassword, "UTF-8");
            String temp2 = MD5Util.MD5Encode(newPassword, "UTF-8");
            if (temp1.equals(adminUser.getLoginPassword())) {
                adminUser.setLoginPassword(temp2);
                return adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0;
            }
        }
        return false;
    }

    @Override
    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            adminUser.setLoginUserName(loginUserName);
            adminUser.setNickName(nickName);
            return adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0;
        }
        return false;
    }
}
