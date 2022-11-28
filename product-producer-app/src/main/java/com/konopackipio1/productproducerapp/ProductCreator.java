package com.konopackipio1.productproducerapp;

import org.apache.commons.lang3.RandomStringUtils;

import com.konopackipio1.productproducerapp.model.Product;

public class ProductCreator {

    static public <T extends Product> T setQrCode(T product) {
        String qrCode = product.getProductKey() + RandomStringUtils.randomAlphanumeric(12);
        product.setQrCode(qrCode);
        return product;
    }
    
}

