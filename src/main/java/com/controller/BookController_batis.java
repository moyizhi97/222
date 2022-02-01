package com.controller;

import com.component.Book;
import com.service.BookService_batis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController_batis {
    @Autowired
    BookService_batis bookService_batis;
    @GetMapping("/bookOpsBatis")
    public void bookOpsBatis(){
        Book b1 = new Book();
        b1.setName("红楼梦");
        b1.setAuthor("施耐庵");
        int i = bookService_batis.addBook(b1);
        System.out.println("addbook>>>>>>>>"+i);
        Book b2 = bookService_batis.getBookById(2);
        System.out.println("getbookbyid>>>>>>>>"+b2.getName()+"///"+b2.getAuthor());
    }
}
