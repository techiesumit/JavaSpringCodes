package com.library.management.library.management.repositories;

import com.library.management.library.management.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, String> {
}
