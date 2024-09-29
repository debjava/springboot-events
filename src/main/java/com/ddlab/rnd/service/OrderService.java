package com.ddlab.rnd.service;

import com.ddlab.rnd.event.CancelEventRecord;
import com.ddlab.rnd.event.NewOrderRecord;

public interface OrderService {

    void createOrder(NewOrderRecord orderEvent);

    void cancelOrder(CancelEventRecord cancelEvent);
}
