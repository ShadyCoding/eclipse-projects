package stack;

import stack.StringStack;

public class Main {

    public static void main(String[] args) {
	    /*IntegerStack stack = new IntegerStack(2);
	    stack.push(12);
        stack.push(32);
        stack.push(42);
        stack.push(52);

        while (!stack.isEmpty()){
            long value = stack.pop();
            System.out.println(value);

        }*/

	    System.out.println(reverseString("hello"));
    }

    public static String reverseString(String string){
        int length = string.length();

        StringStack stringStack = new StringStack(length);
        for (int i = 0; i <string.length() ; i++) {
            char ch = string.charAt(i);
            stringStack.push(ch);
        }

        String result= "";
        while (!stringStack.isEmpty()){
            char ch = stringStack.pop();
            result = result+ch;
        }
        return result;
    }
}
