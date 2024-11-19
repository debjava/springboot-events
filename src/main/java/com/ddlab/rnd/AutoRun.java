package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.ItemOrder;
import com.ddlab.rnd.service.OrderService;

@Component
public class AutoRun {

    @Autowired
    private OrderService orderService;

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        System.out.println("Application running ...");
        
        // Get the order details from Database
        ItemOrder order = new ItemOrder("Samsung Mobile");
        order.setStatus("cancelled");
        orderService.cancelOrder(order);

        //Create a New Order
        ItemOrder newItemOrder = new ItemOrder("Nokia Mobile");
        order.setStatus("New Order");
        orderService.createOrder(newItemOrder);
    }
}
