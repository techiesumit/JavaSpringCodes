package com.library.management.library.management.controller;

import com.library.management.library.management.model.Books;
import com.library.management.library.management.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class BooksController {
    @Autowired
    private BooksRepository booksRepository;
    @GetMapping(value = "/books")
    public List<Books> getBooks(){
        return booksRepository.findAll();
    }

    @PostMapping(value = "/book")
    public ResponseEntity<String> createBook(@RequestBody Books booksRequest){
        Books res = booksRepository.save(booksRequest);
        if( Objects.nonNull(res));
        {
            return new ResponseEntity<>("Book Saved", HttpStatus.OK);
        }
    }
}
