package com.LMS.LibraryManagementSystem.repository;

import com.LMS.LibraryManagementSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}