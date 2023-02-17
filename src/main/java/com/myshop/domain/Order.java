package com.myshop.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@EqualsAndHashCode
@IdClass(OrderItem.class)
public class Order {
    @Id
    private String orderId;

    @ManyToOne(fetch = LAZY)
    private Member memberId;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private String orderAddress;
}
