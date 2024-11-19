package com.ddlab.rnd.service;



import com.ddlab.rnd.entity.ItemOrder;

public interface OrderService {

    void createOrder(ItemOrder itemOrder);

    void cancelOrder(ItemOrder itemOrder);
}
