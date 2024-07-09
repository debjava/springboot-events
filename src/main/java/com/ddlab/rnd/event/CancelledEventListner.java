package com.ddlab.rnd.event;

import com.ddlab.rnd.entity.Order;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CancelledEventListner {

    @EventListener
    public void cancellAndClose(CancelledOrderEvent event) {
        Order order = event.getOrder();
        System.out.println("Order is cancelled and closed for operation ..."+order.getName());
    }
}
