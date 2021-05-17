package com.shopbook.demo.dto;

import com.shopbook.demo.model.Book;

public class BookDto {
    long id;
    String name;
    long price;
    long count;

    public BookDto() {
    }

    public BookDto(long id, String name, long price, long count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public long getCount() {
        return count;
    }

    public static BookDto convertDto(Book book){
        return new BookDto(
                book.getBookId(),
                book.getBookName(),
                book.getPrice(),
                book.getCount()
        );
    }
}
