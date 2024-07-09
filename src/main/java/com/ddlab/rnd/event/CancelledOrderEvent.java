package com.ddlab.rnd.event;

import com.ddlab.rnd.entity.Order;
import lombok.Data;

@Data
public class CancelledOrderEvent {

    private Order order;

    public CancelledOrderEvent(Order order) {
        this.order = order;
    }
}
