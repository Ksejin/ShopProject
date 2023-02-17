package com.myshop.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
public class Cart implements Serializable {

    @Id
    @ManyToOne(fetch = LAZY)
    private Member memberId;

    @Id
    @ManyToOne(fetch = LAZY)
    private Item itemId;

    private int amount;

}
