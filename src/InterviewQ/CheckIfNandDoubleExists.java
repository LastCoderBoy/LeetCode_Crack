package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfNandDoubleExists {
    public static boolean checkIfExist(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        for(int i : arr){
            numbers.add(i);
        }
        boolean condition = false;
        for (int j=0; j< arr.length; j++) {
            if(arr[j]%2 == 0) {
                int num = arr[j]/2;
                if (numbers.contains(num) && j != numbers.indexOf(num)) {
                    condition = true;
                }
            }
        }
        return condition;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
        System.out.println(checkIfExist(new int[]{7,11,1, 3}));
        System.out.println(checkIfExist(new int[]{10,2,5,3,2}));
        System.out.println(checkIfExist(new int[]{0,0}));
    }
}
