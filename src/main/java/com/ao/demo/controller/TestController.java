package com.ao.demo.controller;

import com.ao.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

    @Autowired
    ITestService testService;

    @GetMapping("/testget")
    public String testGet(){
        String result = testService.testGet().get(0);
        System.out.println("--------------"+result);
        return result;
    }
}
