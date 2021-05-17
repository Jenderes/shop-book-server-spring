package com.shopbook.demo.repository;

import com.shopbook.demo.model.Store;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StoreRepository extends PagingAndSortingRepository<Store, Long> {
}
