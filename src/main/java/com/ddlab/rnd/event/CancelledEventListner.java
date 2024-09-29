package com.ddlab.rnd.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.ItemOrder;
@Component
public class CancelledEventListner {

    @Order(1)
    @EventListener
    public void cancelOrder(CancelEventRecord eventRecord) {
        System.out.println("Order is cancelled  ..."+eventRecord.itemOrder().getName());
    }

    @Order(2)
    @EventListener
    public void closeOrder(CancelEventRecord eventRecord) {
        System.out.println("Order is  closed for operation ..."+eventRecord.itemOrder().getName());
    }

    @Order(3)
    @EventListener
    public void putBackOrder(CancelEventRecord eventRecord) {
        System.out.println("Item has been put back in Inventory ..."+eventRecord.itemOrder().getName());
    }
}
