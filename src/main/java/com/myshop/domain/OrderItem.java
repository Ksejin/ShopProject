package com.myshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import java.io.Serializable;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
public class OrderItem implements Serializable {
    @Id
    @ManyToOne(fetch = LAZY)
    private Order orderId;

    @Id
    @ManyToOne(fetch = LAZY)
    private Item itemId;

    @ManyToOne(fetch = LAZY)
    private Member memberId;

    private int orderPrice;

    private int orderQuantity;
}
