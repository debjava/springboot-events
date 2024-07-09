package com.ddlab.rnd.service;

import com.ddlab.rnd.entity.Order;
import com.ddlab.rnd.event.CancelledOrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Override
    public void cancellOrder(Order order) {
        if(order.getStatus().equalsIgnoreCase("cancelled")) {
            CancelledOrderEvent event = new CancelledOrderEvent(order);
            eventPublisher.publishEvent(event);
        }
    }
}
