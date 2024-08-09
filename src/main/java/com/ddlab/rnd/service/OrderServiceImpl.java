package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.ItemOrder;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Override
    public void cancellOrder(ItemOrder order) {
        if(order.getStatus().equalsIgnoreCase("cancelled")) {
            eventPublisher.publishEvent(order);
        }
    }
}
