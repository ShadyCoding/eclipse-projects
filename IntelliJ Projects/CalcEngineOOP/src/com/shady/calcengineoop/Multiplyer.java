package com.shady.calcengineoop;

public class Multiplyer extends CalculateBase {
    public Multiplyer() {
    }
    public Multiplyer(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
