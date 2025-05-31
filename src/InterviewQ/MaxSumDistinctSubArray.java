package InterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxSumDistinctSubArray {
    public static long maximumSubarraySum(int[] nums, int k) {

        long result = 0, currentSum = 0;
        int n = nums.length;
        Set<Integer> window = new HashSet<>();

        int left = 0;
        for (int right = 0; right < n; right++) {
            // Ensure distinct elements in the window
            while (window.contains(nums[right])) {
                window.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            // Add the current element to the window
            window.add(nums[right]);
            currentSum += nums[right];

            // Check if the window size is k
            if (right - left + 1 == k) {
                result = Math.max(result, currentSum);
                // Shrink the window to maintain size k
                window.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }

        return result;

//        long result = 0;
//        for(int i=0; i<nums.length; i++){
//            result = Math.max(result, calculateSum(nums, k, i));
//        }
//        return result;
    }

    private static long calculateSum(int[]code, int k, int i){
        int n = code.length;
        int sum = 0, inc=i, forArrayI=0;
        int[] checkArray = new int[k];
        while(k>0){
            if(inc==n){
                sum=0;
                break;
            }
            checkArray[forArrayI] = code[inc];
            sum += code[inc];
            inc++;
            k--;
            forArrayI++;
        }
        if(hasDupe(checkArray)){
            return 0;
        }
        return sum;
    }

    private static boolean hasDupe(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{1,5,4,2,9,9,9}, 3));
        System.out.println(maximumSubarraySum(new int[]{4,4,4}, 3));
        System.out.println(maximumSubarraySum(new int[]{2,5,4,5}, 4));
    }
}
