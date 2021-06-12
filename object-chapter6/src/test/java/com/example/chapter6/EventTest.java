package com.example.chapter6;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {
    @Test
    void isSatisfied() {
        RecurringSchedule schedule = new RecurringSchedule(
                "회의",
                DayOfWeek.WEDNESDAY,
                LocalTime.of(10, 30),
                Duration.ofMinutes(30)
        );

        Event meeting = new Event(
                "회의",
                LocalDateTime.of(2019, 5, 9, 10, 30),
                Duration.ofMinutes(30)
        );

        assertFalse(meeting.isSatisfied(schedule));
    }
}