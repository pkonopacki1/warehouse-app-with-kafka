package com.konopackipio1.productproducerapp.model;

import lombok.Data;

@Data
public abstract class Product {

    private String qrCode;
    private String productKey;

    public Product(String productKey) {
        this.productKey = productKey;
    }
    
}
