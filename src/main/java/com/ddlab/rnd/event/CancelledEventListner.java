package com.ddlab.rnd.event;

import com.ddlab.rnd.entity.ItemOrder;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;
@Component
public class CancelledEventListner {

    @Order(1)
    @EventListener
    public void cancelOrder(CancelledOrderEvent event) {
        ItemOrder order = event.getOrder();
        System.out.println("Order is cancelled  ..."+order.getName());
    }

    @Order(2)
    @EventListener
    public void closeOrder(CancelledOrderEvent event) {
        ItemOrder order = event.getOrder();
        System.out.println("Order is  closed for operation ..."+order.getName());
    }

    @Order(3)
    @EventListener
    public void putBackOrder(CancelledOrderEvent event) {
        ItemOrder order = event.getOrder();
        System.out.println("Item has been put back in Inventory ..."+order.getName());
    }
}
