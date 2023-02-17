package com.myshop.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@EqualsAndHashCode
@IdClass(Cart.class)
public class Member {

    @Id
    @Column(name = "member_id", nullable = false)
    private String memberId;

    @Column(nullable = false)
    private String memberPassword;

    @Column(nullable = false)
    private String address;

    private String birthDate;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

}
