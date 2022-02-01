package com.Mapper;

import com.component.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int addBook(Book book);
    Book getBookById(Integer id);
}
