package com.ao.demo.controller;

import com.ao.demo.entity.BooksEntity;
import com.ao.demo.service.IBookService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    IBookService bookService;

    @PostMapping("/getBooks")
    public Map<String,Object> getBookList(@RequestBody Map<String,Object> parameterMap){
        Map<String,Object> map = new HashMap<>();
        PageInfo<BooksEntity> pageInfo = bookService.getBookList(parameterMap);
        List<BooksEntity> booksEntityList = pageInfo.getList();
        map.put("books",booksEntityList);
        return map;
    }


}
