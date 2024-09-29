package com.ddlab.rnd.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NewOrderEventListener {

    @EventListener
    public void createOrder(NewOrderRecord orderEvent) {
        System.out.println("Order is created and placed ..."+orderEvent.itemOrder().getName());
    }
}
