package com.library.management.library.management.controller;

import com.library.management.library.management.model.Books;
import com.library.management.library.management.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {
    @Autowired
    private BooksRepository booksRepository;
    @GetMapping(value = "/books")
    public List<Books> getBooks(){
        return booksRepository.findAll();
    }
}
