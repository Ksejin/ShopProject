package com.myshop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review {

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Id
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "image")
    private String image;

    @Lob
    @Column(name = "comment")
    @NotNull
    private String comment;

    @Column(name = "stars")
    @NotNull
    private int stars;

    @Column(name = "review_date")
    @NotNull
    private LocalDateTime reviewDate;
}
