package com.shady.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 5.0d, 32.0d};
        double[] rightVals = {40.0d, 35.0d, 5.0d, 4.0d};
        char[] opCode = {'a', 's', 'm', 'd'};
        double[] result = new double[opCode.length];

        if (args.length == 0) {
            for (int i = 0; i < opCode.length; i++) {
                result[i] = execute(opCode[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : result) {
                System.out.println(currentResult);
            }
        } else if (args.length == 1 && args[0].equals("interactive"))
            executeInterActively();
        else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide operation code and 2 numeric values");

    }

    static void executeInterActively() {
        System.out.println("Enter operation and two numbers ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        if (opCode == 'w')
            handleWhen(parts);
        else {
            double leftVal = valueFromWord(parts[1]);
            double rightVal = valueFromWord(parts[2]);
            double result = execute(opCode, leftVal, rightVal);
            displayResult(opCode, leftVal, rightVal, result);
        }
    }

    private static void handleWhen(String[] parts) {
        LocalDate startDate = LocalDate.parse(parts[1]);
        long daysToAdd = (long) valueFromWord(parts[2]);
        LocalDate newDate = startDate.plusDays(daysToAdd);
        String outPut = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
        System.out.println(outPut);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        char symbol = symbolFromOpCode(opCode);
/*        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append(leftVal);
        stringBuilder.append(" ");
        stringBuilder.append(symbol);
        stringBuilder.append(" ");
        stringBuilder.append(rightVal);
        stringBuilder.append(" = ");
        stringBuilder.append(result);
        String outPut = stringBuilder.toString();*/

        String outPut = String.format("%.3f %c %.3f = %.3f", leftVal, symbol, rightVal, result);
        System.out.println(outPut);
    }

    static char symbolFromOpCode(char opCode) {
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', 'm', '/'};
        char symbol = ' ';

        for (int index = 0; index < opCodes.length; index++) {
            if (opCode == opCodes[index]){
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;

            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid Operator " + opCode);
                result = 0.0d;
        }
        return result;
    }

    static char opCodeFromString(String opCode) {
        char operationCode = opCode.charAt(0);
        return operationCode;
    }

    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"
        };

        double value = -1d;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        if (value == -1d)
            value = Double.parseDouble(word);
        return value;
    }
}
