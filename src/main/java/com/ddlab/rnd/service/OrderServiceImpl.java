package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.event.CancelEventRecord;
import com.ddlab.rnd.event.NewOrderRecord;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Override
    public void createOrder(NewOrderRecord orderEvent) {
        eventPublisher.publishEvent(orderEvent);
    }

    @Override
    public void cancelOrder(CancelEventRecord cancelEvent) {
        eventPublisher.publishEvent(cancelEvent);
    }

}
