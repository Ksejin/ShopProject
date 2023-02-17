package com.myshop.domain;

import com.myshop.domain.complexkey.CartComplexKey;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@IdClass(CartComplexKey.class)
public class Cart implements Serializable {

    @Id
    @Column(name = "member_id")
    private String memberId;

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "amount")
    @NotNull
    private int amount;
}