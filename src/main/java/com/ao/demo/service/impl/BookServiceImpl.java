package com.ao.demo.service.impl;

import com.ao.demo.dao.IBookDao;
import com.ao.demo.entity.BooksEntity;
import com.ao.demo.service.IBookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("bookService")
public class BookServiceImpl implements IBookService {

    @Autowired
    IBookDao bookDao;

    @Override
    public PageInfo<BooksEntity> getBookList(Map<String,Object> map) {
        if (map.get("pageindex") == null || map.get("pagesize") == null){
            List<BooksEntity> list = bookDao.getBookList(map);
            PageInfo<BooksEntity> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        PageHelper.startPage((int)map.get("pageindex"),(int)map.get("pagesize"));
        List<BooksEntity> list = bookDao.getBookList(map);
        PageInfo<BooksEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
