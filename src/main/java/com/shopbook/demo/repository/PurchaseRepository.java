package com.shopbook.demo.repository;

import com.shopbook.demo.model.Purchase;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long> {
}
