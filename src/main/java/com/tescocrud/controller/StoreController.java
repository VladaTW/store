package com.tescocrud.controller;

import com.tescocrud.data.Store;
import com.tescocrud.repository.meat.StoreRepositoryImpl;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Controller("/store")
public class StoreController {

    @Get()
    public List<Store> getStores() {
//    public String getStores() {
        // VLD TODO  injection ?!?
        StoreRepositoryImpl storeRepository = new StoreRepositoryImpl();
        return storeRepository.findAll();
//        return "gotcha!";
    }

    @Post
    public String insertStore(@NotEmpty String store ){
        return "been HEre";
    }


}
