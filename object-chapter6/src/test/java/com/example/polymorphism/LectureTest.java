package com.example.polymorphism;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    @Test
    void test() {
        Lecture lecture = new Lecture(
                70,
                "객체지향 프로그래밍",
                List.of(81, 95, 75, 50, 45));

        assertEquals(lecture.evaluate(), "Pass:3 Fail:2");
    }
}