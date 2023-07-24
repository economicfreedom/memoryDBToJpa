package com.example.memorydbtojpa.book.controller;


import com.example.memorydbtojpa.book.db.entity.BookEntity;
import com.example.memorydbtojpa.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {
    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(
            @RequestBody BookEntity bookEntity
    ) {

//        return bookService.create(bookEntity);
        return null;

    }

    @GetMapping("/all")
    public List<BookEntity> findAll() {
//        return bookService.findAll();
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/find/{id}")
    public BookEntity findById(@PathVariable Long id) {
//        return bookService.findById(id).get();
        return null;

    }

}
