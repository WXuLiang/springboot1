package com.example.springboot1.dao;

import com.example.springboot1.entity.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}