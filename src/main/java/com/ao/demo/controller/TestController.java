package com.ao.demo.controller;

import com.ao.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class TestController {

    @Autowired
    ITestService testService;

    @GetMapping("/testget")
    public Map<String,Object> testGet(){
        Map<String,Object> map = new HashMap<>();
        List<String> result= testService.testGet();
        map.put("result",result);
        System.out.println("--------------"+result);
        return map;
    }

}
