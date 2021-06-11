package com.example.object.movie_reservation_system;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void create() {
        Movie avater = new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10_000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))
                )
        );

        assertNotNull(avater);

        Movie starWars = new Movie(
                "스타워즈",
                Duration.ofMillis(210),
                Money.wons(10_000),
                new NoneDiscountPolicy()
        );

        assertTrue(starWars.getFee().isGreaterThanOrEqual(Money.wons(10_000)));
    }
}