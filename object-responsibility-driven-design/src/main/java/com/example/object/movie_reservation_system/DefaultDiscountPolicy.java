package com.example.object.movie_reservation_system;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private final List<DiscountCondition> conditions;

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        checkPreCondition(screening);

        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                Money amount = getDiscountAmount(screening);
                checkPostCondition(amount);
            }
        }

        return Money.ZERO;
    }

    private void checkPreCondition(Screening screening) {
        assert screening != null && screening.getStartTime().isAfter(LocalDateTime.now());
    }

    private void checkPostCondition(Money amount) {
        assert amount != null && amount.isGreaterThanOrEqual(Money.ZERO);
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
