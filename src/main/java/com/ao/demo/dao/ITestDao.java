package com.ao.demo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("testDao")
public interface ITestDao {

    List<String> testGet();

}
