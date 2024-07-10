package com.ddlab.rnd.event;

import com.ddlab.rnd.entity.ItemOrder;
import lombok.Data;

@Data
public class CancelledOrderEvent {

    private ItemOrder order;

    public CancelledOrderEvent(ItemOrder order) {
        this.order = order;
    }
}
