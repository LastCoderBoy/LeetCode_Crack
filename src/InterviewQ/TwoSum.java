package InterviewQ;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 5, 5, 11}, 10)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{-5, 2,4,8,10}, 10)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsToStore = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int x =0;
            x = target - nums[i];
            if(numsToStore.containsKey(x)){
                return new int[]{i, numsToStore.get(x)};
            }
            numsToStore.put(nums[i], i);
        }

        return null;
    }
}