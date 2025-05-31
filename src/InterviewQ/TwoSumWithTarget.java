package InterviewQ;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumWithTarget {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> arrayNumbers = new HashMap<>();
        for(int i=0; i< numbers.length; i++){
            int x=0;
            x=target-numbers[i];
            if(arrayNumbers.containsKey(x)){
                return new int[]{arrayNumbers.get(x)+1, i+1};
            }
            arrayNumbers.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumWithTarget twoSum = new TwoSumWithTarget();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 5, 5, 11}, 10)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{-5, 2,4,8,10}, 10)));
    }
}
