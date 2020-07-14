package com.iwhalecloud.springboot.service;

import com.iwhalecloud.springboot.dao.BookDao;
import com.iwhalecloud.springboot.entity.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName:
 * @Version information:
 * @Copyright notice:
 * @Date: 2020-07-12 13:46
 **/
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> findAll(){
        return bookDao.findAll();
    }
    public void updateName(){
        bookDao.updateName();
    }
    public void deleteById(Integer id) { bookDao.deleteById(id); }
    public void insertOne(Integer id,String name,String author){
        bookDao.insertOne(id,name,author);
    }



}
