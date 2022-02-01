package com.service;

import com.Mapper.BookMapper;
import com.component.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService_batis {
    @Autowired
    BookMapper bookMapper;
    public int addBook(Book book){
        return bookMapper.addBook(book);
    }
    public Book getBookById(Integer id){
        return bookMapper.getBookById(id);
    }
}
