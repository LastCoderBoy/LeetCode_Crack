package InterviewQ;

import java.util.Stack;

public class EvaluateReversePolishNation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"22"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {

        if(tokens.length == 1) return Integer.parseInt(tokens[0]);

        Stack<String> stack = new Stack<>();
        int result = 0, second, first;
        boolean condition = true;
        for(String letter : tokens){
            switch (letter){
                case "+":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first + second;
                    stack.push(String.valueOf(result));
                    condition = false;
                    break;
                case "-":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first - second;
                    stack.push(String.valueOf(result));
                    condition = false;
                    break;
                case "*":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first * second;
                    stack.push(String.valueOf(result));
                    condition = false;
                    break;
                case "/":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first / second;
                    stack.push(String.valueOf(result));
                    condition = false;
                    break;
                default:
                    condition = true;
            }
            if(condition){
                stack.push(letter);
            }

        }

        return result;
    }
}
