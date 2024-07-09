package com.ddlab.rnd.entity;

import lombok.Data;

@Data
public class Order {

    private String name;
    private String status;

    public Order(String name) {
        this.name = name;
    }
}
