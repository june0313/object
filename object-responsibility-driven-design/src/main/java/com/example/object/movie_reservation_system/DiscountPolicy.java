package com.example.object.movie_reservation_system;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
