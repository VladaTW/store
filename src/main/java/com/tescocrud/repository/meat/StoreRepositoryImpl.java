package com.tescocrud.repository.meat;

import com.tescocrud.data.Store;
import com.tescocrud.data.StoreType;
import com.tescocrud.repository.StoreRepository;

import java.util.ArrayList;
import java.util.List;

public class StoreRepositoryImpl implements StoreRepository {
    @Override
    public List<Store> findAll() {
        Store store = new Store(1, 12, "Royston", StoreType.SO_SO);
        List<Store> stores = new ArrayList<>();
        stores.add(store);
        // VLD TODO implement this one
        return stores;
    }
}
