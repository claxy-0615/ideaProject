package com.iwhalecloud.springboot.dao;

import com.iwhalecloud.springboot.entity.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * @ClassName:
 * @Version information:
 * @Copyright notice:
 * @Date: 2020-07-12 13:32
 **/
@Mapper
@Component
public interface BookDao {

    @Results({ //2
            @Result(property = "id", column = "id"), //2
            @Result(property = "name", column = "name"),
            @Result(property = "author", column = "author")
    })

    @Select("select * from book")
    List<Book> findAll();

    @Delete("delete from book where id = ${id}")
    void deleteById(@Param("id") Integer id);

    @Update("update book set name = '齐天大圣孙悟空' where author = 'wce'")
    void updateName();

    @Insert("insert into book (id,name,author) values(${id},'${name}','${author}')")
    void insertOne(@Param("id") Integer id,@Param("name") String name,@Param("author") String author);

}
