package com.ao.demo.service.impl;

import com.ao.demo.dao.IUserDao;
import com.ao.demo.entity.UserInfo;
import com.ao.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    @Override
    @Transactional
    public String addUserInfo(UserInfo userInfo) {
        try {
            userDao.addUserInfo(userInfo);
        }catch (Exception e){
            return "保存用户信息成功";
        }
        return "保存用户信息失败";
    }
}
