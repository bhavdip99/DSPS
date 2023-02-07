package com.bhavdip.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 1: Equation Evaluation
 * Given a string as input to the function. The string contains numbers and arithmetic operands in the form of an equation. The task is to print out the value of the equation.
 * Notes:
 * •	Input to the function is the string
 * •	Return value should be void
 * •	Printout should be the value of the equation
 * •	All numbers are non-negative
 * •	The arithmetic operands will only be ‘+’ and ‘-‘
 * •	The string may contain spaces, the function must ignore them
 * •	The string is guaranteed to alternate between numbers and operands. It will start and end with a number.
 * •	The string is guaranteed not to contain spaces inside of a number.
 * String: “123+5-121-9”
 * Output printed must be -2
 * String: “123   + 5    “
 * Output printed must be: 128
 */
public class EquationEvaluationStack {
    public static void main(String[] args) {
        String str = "123  +5-121-9";
//        String str1 = "12 +12- 12-12";

        System.out.println("Result-" + equation(str));
    }

    public static int equation(String eqStr) {
        char[] chars = eqStr.toCharArray();
        List<String> charStack = new ArrayList<>();
        int counter;
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == '-' || aChar == '+') {
                charStack.add(sb.toString());
                sb = new StringBuilder();
                charStack.add(String.valueOf(aChar));
            }
            if (aChar >= '0' && aChar <= '9') {
                sb.append(aChar);
            }
        }
        charStack.add(sb.toString());

        counter = Integer.parseInt(charStack.get(0));
        for (int i = 2; i < charStack.size(); i++) {
            if (charStack.get(i).equals("-") || charStack.get(i).equals("+")) {
                continue;
            }
            counter = applyOp(charStack.get(i - 1), counter, Integer.parseInt(charStack.get(i)));
        }
        return counter;
    }

    public static int applyOp(String op, int a, int b) {
        return switch (op) {
            case "-" -> a - b;
            case "+" -> a + b;
            default -> 0;
        };
    }
}
