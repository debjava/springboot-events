package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.ItemOrder;
import com.ddlab.rnd.event.CancelEventRecord;
import com.ddlab.rnd.event.NewOrderRecord;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Override
    public void createOrder(ItemOrder itemOrder) {
    	//Wrap the order inside a record for the listener
    	NewOrderRecord newOrder = new NewOrderRecord(itemOrder);
        eventPublisher.publishEvent(newOrder);
    }

    @Override
    public void cancelOrder(ItemOrder itemOrder) {
    	//Wrap the order inside a record for the listener
    	CancelEventRecord cancelOrder = new CancelEventRecord(itemOrder);
        eventPublisher.publishEvent(cancelOrder);
    }

}
