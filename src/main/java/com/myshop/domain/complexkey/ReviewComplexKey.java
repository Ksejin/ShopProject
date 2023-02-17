package com.myshop.domain.complexkey;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
public class ReviewComplexKey implements Serializable {
    private String itemId;
    private String memberId;
}
