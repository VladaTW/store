package com.tescocrud.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Store {
    private final Integer Id;
    private final Integer numberOfTills;
    private final String name;
    private final StoreType type;
}
