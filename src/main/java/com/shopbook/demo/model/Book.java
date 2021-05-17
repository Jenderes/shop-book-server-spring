package com.shopbook.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "count")
    private long count;

    @Column(name = "price")
    private long price;

    @Column(name = "storage")
    private String storage;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
    private List<Purchase> purchaseList;

    public Book(long bookId, String bookName, long count,
                long price, String storage, List<Purchase> purchaseList) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.count = count;
        this.price = price;
        this.storage = storage;
        this.purchaseList = purchaseList;
    }

    public Book() {
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }
}
