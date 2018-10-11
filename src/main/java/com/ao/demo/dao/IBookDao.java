package com.ao.demo.dao;

import com.ao.demo.entity.BooksEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("BookDao")
public interface IBookDao {
    List<BooksEntity> getBookList(Map<String,Object> map);
}
