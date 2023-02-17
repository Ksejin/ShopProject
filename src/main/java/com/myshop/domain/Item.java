package com.myshop.domain;

import com.myshop.domain.enums.OnSaleStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "category")
    @NotNull
    private String category;

    @Column(name = "price")
    @NotNull
    private int price;

    @Column(name = "stock")
    @NotNull
    private int stock;

    @Column(name = "discount_rate")
    @NotNull
    private double discountRate;

    @Column(name = "item_image")
    @NotNull
    private String itemImage;

    @Enumerated(EnumType.STRING)
    @Column(name = "on_sale")
    @NotNull
    private OnSaleStatus onSale; //SALEl, SOLD

    @Lob
    @Column(name = "item_detail")
    @NotNull
    private String itemDetail;

}
