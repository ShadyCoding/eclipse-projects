package com.shady.calcengineoop;

import java.lang.reflect.MalformedParameterizedTypeException;

public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) {
        //input add 10.0 5.0
        //output 10.0 + 5.0 = 15.0

        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyWord = parts[0];//Add

        MathProcessing theHandlers = null;
        for (MathProcessing handler : handlers) {
            if (keyWord.equalsIgnoreCase(handler.getKeyWord())) {
                theHandlers = handler;
                break;
            }
        }
        double leftVal = Double.parseDouble(parts[1]);// 10.0
        double rightVal = Double.parseDouble(parts[2]); // 5.0

        double result = theHandlers.doCalculation(leftVal, rightVal);

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandlers.getSymbol());
        sb.append(" ");
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
