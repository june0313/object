package com.example.object.movie_reservation_system;

public class NoneDiscountPolicy extends DiscountPolicy {
    public NoneDiscountPolicy(DiscountCondition... conditions) {
        super(conditions);
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
