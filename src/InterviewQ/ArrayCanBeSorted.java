package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCanBeSorted {
    public static boolean canSortArray(int[] nums) {
        // [8, 4, 2, 30, 15]
        int n=nums.length;
        if (n == 0 || n == 1)
            return true;
        List<Integer> sameBitsList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        sameBitsList.add(nums[0]);
        for(int i=1; i<n; i++){
            if(countSetBits(nums[i]) == countSetBits(nums[i-1]) ) {
                sameBitsList.add(nums[i]);
                Collections.sort(sameBitsList);
            }else {
                result.addAll(sameBitsList);
                sameBitsList.clear();
                sameBitsList.add(nums[i]);
            }
        }
        if (!sameBitsList.isEmpty()) {
            Collections.sort(sameBitsList);
            result.addAll(sameBitsList);
        }
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i - 1) > result.get(i)) {
                return false;
            }
        }
        return true;
    }
    static int countSetBits(int num) {
        return Integer.bitCount(num);  // Built-in method to count set bits
    }

    public static void main(String[] args) {
        System.out.println(canSortArray(
                new int[]{8, 4, 2, 30, 15}
        ));
        System.out.println(canSortArray(
                new int[]{3,16,8,4,2}
        ));
        System.out.println(canSortArray(
                new int[]{1,2,3,4,5}
        ));
    }
}
