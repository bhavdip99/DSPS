package com.bhavdip.codechef;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String args[]) {
        System.out.println("String is valid parenthesis: " + isValid("{[](){}}{[]}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stackOb = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stackOb.push(c);
            } else if (c == ')' && !stackOb.isEmpty() && stackOb.peek() == '(') {
                stackOb.pop();
            } else if (c == '}' && !stackOb.isEmpty() && stackOb.peek() == '{') {
                stackOb.pop();
            } else if (c == ']' && !stackOb.isEmpty() && stackOb.peek() == '[') {
                stackOb.pop();
            } else {
                return false;
            }
        }
        return stackOb.isEmpty();
    }

}
