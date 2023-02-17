package com.myshop.domain.complexkey;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
public class CartComplexKey implements Serializable {
    private String memberId;
    private String itemId;
}
