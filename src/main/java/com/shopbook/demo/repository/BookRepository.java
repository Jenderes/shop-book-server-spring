package com.shopbook.demo.repository;

import com.shopbook.demo.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
}
