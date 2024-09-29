package com.ddlab.rnd;

import com.ddlab.rnd.entity.ItemOrder;
import com.ddlab.rnd.event.CancelEventRecord;
import com.ddlab.rnd.event.NewOrderRecord;
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
        ItemOrder order = new ItemOrder("Samsung Mobile");
        order.setStatus("cancelled");
        // Wrap the order inside an envent to distinguish
        CancelEventRecord eventRecord = new CancelEventRecord(order);
        orderService.cancelOrder(eventRecord);

        //Create a New Order

        ItemOrder newItemOrder = new ItemOrder("Nokia Mobile");
        order.setStatus("New Order");
        NewOrderRecord newOrder = new NewOrderRecord(newItemOrder);
        orderService.createOrder(newOrder);
    }
}
