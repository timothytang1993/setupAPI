package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PriceResponse implements Serializable {
    private int price;

    @JsonProperty("price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
