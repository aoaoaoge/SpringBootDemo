package com.ao.demo.controller;

import com.ao.demo.entity.UserInfo;
import com.ao.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/addUserInfo")
    public Map<String,String> addUserInfo(@RequestBody UserInfo userInfo){
        String flag = userService.addUserInfo(userInfo);
        Map<String,String > map = new HashMap<>();
        map.put("message",flag);
        return map;
    }
}
