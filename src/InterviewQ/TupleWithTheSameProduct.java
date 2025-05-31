package InterviewQ;

import java.util.Arrays;
import java.util.HashMap;

public class TupleWithTheSameProduct {
    public static void main(String[] args) {
        System.out.println(tupleSameProduct(new int[]{2,3,4,6,8,12}));
        System.out.println(tupleSameProduct(new int[]{2, 3, 4, 6}));
        System.out.println(tupleSameProduct(new int[]{1, 2, 4, 5, 10}));
    }
    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        int total = 0;
        for (int count : map.values()) {
            if (count > 1) {
                total += (count * (count - 1) / 2) * 8;
            }
        }


        return total;
    }
}
