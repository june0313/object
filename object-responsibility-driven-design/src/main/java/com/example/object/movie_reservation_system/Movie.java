package com.example.object.movie_reservation_system;

import java.time.Duration;
import java.time.LocalDateTime;

public class Movie {
    private final String title;
    private final Duration runningTime;
    private final Money fee;
    private final DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        if (screening == null || screening.getStartTime().isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException();
        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
