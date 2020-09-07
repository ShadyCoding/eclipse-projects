package com.example;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1 = getInput("Enter 1st value: ");
        String str2 = getInput("Enter 2nd value: ");
        String op = getInput("Choose an operator (+ - / * ) ");

        double result = 0;
        switch (op) {
            case "+":
                result = addValues(str1, str2);
                break;
            case "-":
                result = subtractValues(str1, str2);
                break;
            case "/":
                result = divideValues(str1, str2);
                break;
            case "*":
                result = multiplyValues(str1, str2);
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("The result is: "+result);
    }

    private static double multiplyValues(String str1, String str2) {
        double val1 = Double.parseDouble(str1);
        double val2 = Double.parseDouble(str2);
        return val1*val2;
    }

    private static double divideValues(String str1, String str2) {
        double val1 = Double.parseDouble(str1);
        double val2 = Double.parseDouble(str2);
        return val1/val2;
    }

    private static double subtractValues(String str1, String str2) {
        double val1 = Double.parseDouble(str1);
        double val2 = Double.parseDouble(str2);
        return val1-val2;
    }

    private static double addValues(String str1, String str2) {
        double val1 = Double.parseDouble(str1);
        double val2 = Double.parseDouble(str2);
        return val1+val2;
    }

    private static String getInput (String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
}


