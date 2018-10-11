package com.ao.demo.service;

import com.ao.demo.entity.BooksEntity;
import com.github.pagehelper.PageInfo;


import java.util.Map;

public interface IBookService {
    PageInfo<BooksEntity> getBookList(Map<String,Object> map);
}
