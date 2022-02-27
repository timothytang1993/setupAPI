package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceRequest {
    private String productName;

    @JsonProperty("product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
