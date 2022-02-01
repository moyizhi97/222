package com.Dao;

import com.component.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public Book getBookById(Integer id){
        return jdbcTemplate.queryForObject("select * from book where id = ?",new BeanPropertyRowMapper<>(Book.class),id);
    }
}
