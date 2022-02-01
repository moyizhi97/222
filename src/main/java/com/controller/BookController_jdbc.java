package com.controller;

import com.component.Book;
import com.service.BookService_jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController_jdbc {
    @Autowired
    BookService_jdbc bookService;
    @GetMapping("/bookOps")
    public void bookOps(){
        Book b3 = bookService.getBookById(1);
        System.out.println(b3.getAuthor()+"//"+b3.getName());
    }
}
