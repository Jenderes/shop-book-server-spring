package com.shopbook.demo.service;

import com.shopbook.demo.dto.BookDto;
import com.shopbook.demo.model.Book;
import com.shopbook.demo.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Page<Book> findAllBook(Pageable pageable) {
        return this.bookRepository.findAll(pageable);
    }
}
