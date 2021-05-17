package com.shopbook.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "discount", length = 2)
    private int discount;

    @Column(name = "name")
    private String name;

    @Column(name = "living_area")
    private String livingArea;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Purchase> purchaseList;


    public Customer() {
    }

    public Customer(long customerId, int discount, String name,
                    String livingArea, List<Purchase> purchaseList) {
        this.customerId = customerId;
        this.discount = discount;
        this.name = name;
        this.livingArea = livingArea;
        this.purchaseList = purchaseList;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }
}
