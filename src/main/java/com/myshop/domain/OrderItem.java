package com.myshop.domain;

import com.myshop.domain.complexkey.OrderItemComplexKey;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@IdClass(OrderItemComplexKey.class)
public class OrderItem implements Serializable {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "order_price")
    private int orderPrice;

    @Column(name = "order_quantity")
    private int orderQuantity;
}
