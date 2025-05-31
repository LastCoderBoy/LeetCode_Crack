package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class DifferentWaysToAddParenthesis {
    public List<Integer> diffWaysToCompute(String expression) {
       List<Integer> results = new ArrayList<>();
       for(int i=0; i<expression.length();i++){
           char operation = expression.charAt(i);
           if(operation == '+' || operation == '-' || operation == '*'){
               String leftPart = expression.substring(0, i);
               String rightPart = expression.substring(i+1);

               List<Integer> leftResult = diffWaysToCompute(leftPart);
               List<Integer> rightResult = diffWaysToCompute(rightPart);

               for(int left:leftResult){
                   for(int right:rightResult){
                       if(operation == '+'){
                           results.add(left+right);
                       }
                       else if(operation == '-'){
                           results.add(left-right);
                       }
                       else if (operation == '*') {
                           results.add(left * right);
                       }
                   }
               }
           }
       }
       if (results.isEmpty()) {
           results.add(Integer.parseInt(expression));
       }
       return results;
    }

    public static void main(String[] args) {
        DifferentWaysToAddParenthesis waysToAddParenthesis = new DifferentWaysToAddParenthesis();
        System.out.println(waysToAddParenthesis.diffWaysToCompute("2*3-4*5"));
    }

}
