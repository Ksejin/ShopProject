package com.myshop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_password")
    @NotNull
    private String memberPassword;

    @Column(name = "address")
    @NotNull
    private String address;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "gender")
    @NotNull
    private String gender;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "phone")
    @NotNull
    private String phone;

}
