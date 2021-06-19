package com.example.polymorphism;

import java.util.List;
import java.util.stream.Collectors;

public class GradeLecture extends Lecture {
    private List<Grade> grades;
    public GradeLecture(int pass, String title, List<Grade> grades, List<Integer> scores) {
        super(pass, title, scores);
        this.grades = grades;
    }

    @Override
    public String evaluate() {
        return super.evaluate() + " " + gradesStatistics();
    }

    private String gradesStatistics() {
        return grades.stream()
                .map(this::format)
                .collect(Collectors.joining());
    }

    private String format(Grade grade) {
        return String.format("%s:%d ", grade.getName(), gradeCount(grade));
    }

    private long gradeCount(Grade grade) {
        return getScores().stream()
                .filter(grade::include)
                .count();
    }
}
