package com.ao.demo.dao;

import com.ao.demo.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface IUserDao{
    void addUserInfo(UserInfo userInfo);
}
