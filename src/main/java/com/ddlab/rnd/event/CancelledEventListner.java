package com.ddlab.rnd.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.ItemOrder;
@Component
public class CancelledEventListner {

    @Order(1)
    @EventListener
    public void cancelOrder(ItemOrder order) {
        System.out.println("Order is cancelled  ..."+order.getName());
    }

    @Order(2)
    @EventListener
    public void closeOrder(ItemOrder order) {
        System.out.println("Order is  closed for operation ..."+order.getName());
    }

    @Order(3)
    @EventListener
    public void putBackOrder(ItemOrder order) {
        System.out.println("Item has been put back in Inventory ..."+order.getName());
    }
}
