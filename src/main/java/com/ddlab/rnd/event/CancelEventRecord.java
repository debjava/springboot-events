package com.ddlab.rnd.event;

import com.ddlab.rnd.entity.ItemOrder;
// Only for cancelling the order
public record CancelEventRecord(ItemOrder itemOrder)  {

}

