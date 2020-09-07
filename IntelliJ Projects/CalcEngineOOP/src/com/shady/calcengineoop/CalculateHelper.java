package com.shady.calcengineoop;

public class CalculateHelper {
    public static final char ADD_SYMBOL = '+';
    public static final char SUBTRACT_SYMBOL = '-';
    public static final char MULTIPLY_SYMBOL = '*';
    public static final char DIVIDE_SYMBOL = '/';

    MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    public void process(String statements)throws InvalidStatementException{
        // add 1.0 2.0
        String[] parts = statements.split(" ");
        if (parts.length != 3){
            throw new InvalidStatementException("Incorrect number of fields ", statements);
        }
        String commandString = parts[0]; // add
        try {
            leftVal = Double.parseDouble(parts[1]);//   1.0
            rightVal = Double.parseDouble(parts[2]);//  2.0
        }catch (NumberFormatException e) {
            throw new InvalidStatementException("Non-numeric dat", statements, e);
        }
        setCommandFromString(commandString);
        if (command == null)
            throw new  InvalidStatementException("Invalid Command", statements);

        CalculateBase calculator = null;
        switch (command){
            case Add:
                calculator = new Adder(leftVal, rightVal);
                break;
            case Subtract:
                calculator = new Subtracter(leftVal, rightVal);
                break;
            case Multiply:
                calculator = new Multiplyer(leftVal, rightVal);
                break;
            case Divide:
                calculator = new Divider(leftVal, rightVal);
                break;
        }
        calculator.calculate();
        result = calculator.getResult();
    }

    private void setCommandFromString(String commandString){
        //add -> MathCommand.Add
        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
    }

    @Override
    public String toString() {
        char symbol = ' ';
        switch (command){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(symbol);
        sb.append(" ");
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
