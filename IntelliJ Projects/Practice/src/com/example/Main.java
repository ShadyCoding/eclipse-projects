package com.example;

public class Main {

    public static void main(String[] args) {
        int[] perStudentPetCount = {1, 2, 3, 4, 0, 0, 4, 3, 2};
        int studentCount = perStudentPetCount.length;
        //avg = numOfItem/numOfStudent
        int sum = 0;
        for (int i = 0; i < perStudentPetCount.length; i++) {
            sum = sum+i;
        }
        int avg = sum/studentCount;
        System.out.println(avg);
    }
}
