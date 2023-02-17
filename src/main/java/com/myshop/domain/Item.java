package com.myshop.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Getter
@EqualsAndHashCode
@IdClass(Cart.class)
public class Item {

    @Id
    private String itemId;

    private String name;

    private String category;

    private int price;

    private int stock;

    private double discountRate;

    private String itemImage;

    @Enumerated(EnumType.STRING)
    private OnSaleStatus onSale; //SALEl, SOLD

    @Lob
    private String itemDetail;

}
