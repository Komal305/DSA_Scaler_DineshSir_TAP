package assesmentsQuestion;

import java.util.Stack;

public class ValidParentheses {
    public static int countValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int validPairs = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
               // validPairs++;
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    validPairs++;
                }
            }
        }

        return validPairs/2*2 ; // Each valid pair consists of two characters
    }

    public static void main(String[] args) {
        String s3 = ")(()((()())((()(()()((())((()((())(()))))))()()))(()(()(((((((())))()))(((()(((()())((((()))))())))(";

        System.out.println("Total valid parentheses characters in \"" + "\": " + countValidParentheses(s3));
    }
}

