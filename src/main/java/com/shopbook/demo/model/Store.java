package com.shopbook.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private long storeId;

    @Column(name = "commission", length = 2)
    private int commission;

    @Column(name = "store_area")
    private String storeArea;

    @Column(name = "store_name")
    private String storeName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
    private List<Purchase> purchaseList;

    public Store() {
    }

    public Store(long storeId, int commission, String storeArea,
                 String storeName, List<Purchase> purchaseList) {
        this.storeId = storeId;
        this.commission = commission;
        this.storeArea = storeArea;
        this.storeName = storeName;
        this.purchaseList = purchaseList;
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public String getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(String storeArea) {
        this.storeArea = storeArea;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }
}
