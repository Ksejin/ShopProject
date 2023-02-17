package com.myshop.domain.complexkey;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
public class OrderItemComplexKey implements Serializable {
    private String orderId;
    private String itemId;
}
