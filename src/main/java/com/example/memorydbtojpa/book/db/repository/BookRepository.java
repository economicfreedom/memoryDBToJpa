package com.example.memorydbtojpa.book.db.repository;

import com.example.memorydbtojpa.book.db.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
