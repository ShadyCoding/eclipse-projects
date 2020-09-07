package com.shady.assignment;

public class GradeTracker {
    Student student;

    public GradeTracker(Student student) {
        this.student = student;
    }


    public String getLetterGrade() {
        for (int i = 0; i < student.getExams().size(); i++) {
            if (student.getExams().get(i) >= 90) {
                return "A";
            } else if (student.getExams().get(i) >= 80) {
                return "B";
            } else if (student.getExams().get(i) >= 70) {
                return "C";
            }
        }
        return "F";
    }
}
