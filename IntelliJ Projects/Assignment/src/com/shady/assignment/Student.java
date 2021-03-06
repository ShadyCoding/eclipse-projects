package com.shady.assignment;

import java.util.ArrayList;

/**
 * Represents a student and their scores in a class.
 * Stores the name, assignment scores and exam scores.
 *
 * @author Jill Seaman
 */
public class Student implements Average{

    private String name;                    // Students full name
    private ArrayList<Double> assignments;  // scores for the assignments
    private ArrayList<Double> exams;        // scores for the exams

    /**
     * Constructs the student from their name
     *
     * @param name full name of the student.
     */
    public Student(String name) {
        this.name = name;
        assignments = new ArrayList<Double>();
        exams = new ArrayList<Double>();
    }

    /**
     * @return the student's full name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds an assignment score to the collection of assignment scores for the student.
     *
     * @param as the assignment score to add
     */
    public void addAssignmentScore(double as) {
        assignments.add(as);
    }

    /**
     * Adds an exam score to the collection of exam scores for the student.
     *
     * @param es the exam score to add
     */
    public void addExamScore(double es) {
        exams.add(es);
    }

    public ArrayList<Double> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Double> assignments) {
        this.assignments = assignments;
    }

    public ArrayList<Double> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Double> exams) {
        this.exams = exams;
    }

    public boolean setDropLowestAssign(boolean b) {
        double aSize = assignments.size();
        double[] temp = {};
        double maxScore = 0.0;
        for (int as = 0; as < aSize; as++) {
            if (assignments.get(as) != 0 && aSize < 2) {
                temp[as] = assignments.get(as);
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > maxScore) {
                maxScore = temp[i];
            }
        }
        return b;
    }

	@Override
	public double getAverage() {
		double aSize = assignments.size();
        double aSum = 0.0;
        double avg;
        for (int as = 0; as < aSize; as++) {
            aSum = aSum + assignments.get(as);
        }
        avg = aSum / aSize;
        return avg;
	}
}
