package com.tescocrud.repository;

import com.tescocrud.data.Store;

import java.util.List;

public interface StoreRepository {
    List<Store> findAll();
}
