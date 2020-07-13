package com.iwhalecloud.springboot.controller;

import com.iwhalecloud.springboot.entity.Book;
import com.iwhalecloud.springboot.service.BookService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: BookController
 * @Version information: 001
 * @Copyright notice: iwhalecloud
 * @Date: 2020-07-11 20:04
 **/

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/findAll")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @RequestMapping("/update")
    public void update(){
        bookService.updateName();
    }

    @RequestMapping("/insert")
    public void insert(){
        bookService.insertOne(4,"水浒传","sna");
    }

    @RequestMapping("/deleteById")
    public void delete(){
        bookService.deleteById(3);
    }
}
