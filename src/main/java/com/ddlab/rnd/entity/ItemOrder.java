package com.ddlab.rnd.entity;

import lombok.Data;

@Data
public class ItemOrder {

    private String name;
    private String status;

    public ItemOrder(String name) {
        this.name = name;
    }
}
