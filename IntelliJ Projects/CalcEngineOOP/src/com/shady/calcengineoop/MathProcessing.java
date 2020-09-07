package com.shady.calcengineoop;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyWord();
    char getSymbol();
    double doCalculation(double leftVal, double rightVal);

}
