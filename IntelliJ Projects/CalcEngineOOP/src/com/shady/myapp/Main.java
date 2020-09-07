package com.shady.myapp;

import com.shady.calcengineoop.Adder;
import com.shady.calcengineoop.CalculateBase;
import com.shady.calcengineoop.CalculateHelper;
import com.shady.calcengineoop.Divider;
import com.shady.calcengineoop.DynamicHelper;
import com.shady.calcengineoop.InvalidStatementException;
import com.shady.calcengineoop.MathEquation;
import com.shady.calcengineoop.MathProcessing;
import com.shady.calcengineoop.Multiplyer;
import com.shady.calcengineoop.PowerOf;
import com.shady.calcengineoop.Subtracter;

import javax.annotation.processing.SupportedSourceVersion;

public class Main {

    public static void main(String[] args) {
//        useMathEquation();
//        useCalculatorBase();
//        useCalculateHelper();

        String[] statements =
                {
                        "add 100.0 50.0",
                        "power 5.0 2.0"
                };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()
        });
        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);
        }
    }

    public static void useCalculateHelper() {
        String[] statements =
                {
                        "add 1.0",
                        "add xx 1.0",
                        "addx 1.0 3.0",
                        "divide 100.0 50.0",
                        "add 100.0 50.0",
                        "subtract 100.0 50.0",
                        "multiply 100.0 50.0"
                };
        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println(" Original Exception: " + e.getCause().getMessage());
            }
        }
    }

    public static void useCalculatorBase() {
        CalculateBase[] calculateBase =
                {
                        new Adder(100.0d, 50.0d),
                        new Subtracter(100.0d, 50.0d),
                        new Multiplyer(100.0d, 50.0d),
                        new Divider(100.0d, 50.0d),
                };
        for (CalculateBase calculate : calculateBase) {
            calculate.calculate();
            System.out.print("Result = ");
            System.out.println(calculate.getResult());

        }
    }

    public static void useMathEquation() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('a', 100.0d, 50.0d);
        equations[1] = new MathEquation('s', 100.0d, 50.0d);
        equations[2] = new MathEquation('m', 100.0d, 50.0d);
        equations[3] = new MathEquation('d', 100.0d, 50.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }
        System.out.println();
        System.out.println("Overloading Result");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverloading = new MathEquation('d');

        equationOverloading.execute(leftDouble, rightDouble);
        System.out.print("Result = ");
        System.out.println(equationOverloading.getResult());

        equationOverloading.execute(leftInt, rightInt);
        System.out.print("Result = ");
        System.out.println(equationOverloading.getResult());

        equationOverloading.execute((double) leftInt, rightInt);// java will choose with both double parameter execute method
        System.out.print("Result = ");
        System.out.println(equationOverloading.getResult());

        System.out.println();
        System.out.println("Inheritance Result");
        System.out.println();
    }


//    public static MathEquation create(double leftVal, double rightVal, char opCode){
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
