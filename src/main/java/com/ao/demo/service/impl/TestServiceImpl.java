package com.ao.demo.service.impl;

import com.ao.demo.dao.ITestDao;
import com.ao.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestServiceImpl implements ITestService {

    @Autowired
    ITestDao testDao;

    @Override
    public List<String> testGet() {
        return testDao.testGet();
    }
}
