package com.example.polymorphism;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradeLectureTest {
    @Test
    void test() {
        Lecture lecture = new GradeLecture(70,
                "객체지향 프로그래밍",
                List.of(
                        new Grade("A", 100, 95),
                        new Grade("B", 94, 80),
                        new Grade("C", 79, 70),
                        new Grade("D", 69, 50),
                        new Grade("F", 49, 0)),
                List.of(81, 95, 75, 50, 45));

        assertEquals(lecture.evaluate(), "Pass:3 Fail:2 A:1 B:1 C:1 D:1 F:1 ");
    }
}