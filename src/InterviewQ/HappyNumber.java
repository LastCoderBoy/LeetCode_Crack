package InterviewQ;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class HappyNumber {
    public static boolean isHappy(int n) {
//        if(n<10 && n>0 && n!=1){
//            return false;
//        }

        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        int result = calculateSum((digits));
        List<Integer> infiniteNumbers = new ArrayList<>();
        infiniteNumbers.add(result);
        while( n != 1 && result != 1 && result != 7){
            number = String.valueOf(result);
            digits = number.toCharArray();
            result = calculateSum((digits));
            if(infiniteNumbers.contains(result)){
                return false;
            }
            infiniteNumbers.add(result);
        }


        return true;
    }
    private static int calculateSum(char[] digits){
        int result = 0;
        for(int i=0; i<digits.length; i++){
            String digit = String.valueOf(digits[i]);
            result += (int) Math.pow(Integer.valueOf(digit), 2);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(7));
        System.out.println(isHappy(2));
        System.out.println(isHappy(12));
    }

}
