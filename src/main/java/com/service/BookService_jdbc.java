package com.service;

import com.Dao.BookDao;
import com.component.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService_jdbc {
    @Autowired
    BookDao bookDao;
    public Book getBookById(Integer id){
        return bookDao.getBookById(id);
    }
}
