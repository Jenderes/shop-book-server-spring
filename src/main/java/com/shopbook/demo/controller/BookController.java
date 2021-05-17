package com.shopbook.demo.controller;

import com.shopbook.demo.dto.BookDto;
import com.shopbook.demo.model.Book;
import com.shopbook.demo.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/book/")
public class BookController {
    public final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("all")
    public Page<BookDto> findAllBook(final Pageable pageable) {
        List <BookDto> bookDtoList = bookService.findAllBook(pageable).getContent()
                .stream()
                .map(BookDto::convertDto)
                .collect(Collectors.toList());
        return new PageImpl<>(bookDtoList, pageable, bookDtoList.size());
    }
    @GetMapping("hello")
    public String sendHello() {
        return "hello";
    }
}
