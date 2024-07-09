package com.ddlab.rnd;

import com.ddlab.rnd.entity.Order;
import com.ddlab.rnd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AutoRun {

    @Autowired
    private OrderService orderService;

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        System.out.println("Application running ...");
        // Get the order details from Database
        Order order = new Order("Samsung Mobile");
        order.setStatus("cancelled");
        orderService.cancellOrder(order);
    }
}
