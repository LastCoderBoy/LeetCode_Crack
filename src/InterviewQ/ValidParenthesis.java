package InterviewQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        // " []{}() "

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else {
                return false;
            }
        }
        // Stack should be empty if all brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{()}()("));
    }
}
