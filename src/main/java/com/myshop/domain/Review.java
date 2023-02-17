package com.myshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
public class Review {

    @Id
    @ManyToOne(fetch = LAZY)
    private Item itemId;

    @Id
    @ManyToOne(fetch = LAZY)
    private Member memberId;

    private String image;

    @Lob
    private String comment;

    private int stars;

    private LocalDateTime reviewDate;
}
