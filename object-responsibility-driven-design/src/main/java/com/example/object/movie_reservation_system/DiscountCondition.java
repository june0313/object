package com.example.object.movie_reservation_system;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
