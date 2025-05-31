package InterviewQ;

import java.util.Arrays;

public class ShortestSubarrayWithOR {
    public static int minimumSubarrayLength(int[] nums, int k) {
        // [1, 2, 3]; k=2
//        int n = nums.length;
//        int minLength = Integer.MAX_VALUE;
//        int currentOR = 0;
//        int start = 0;
//
//        for (int end = 0; end < n; end++) {
//            currentOR |= nums[end];  // Add the current element to the OR result
//
//            // Shrink the window from the left if we have met or exceeded the OR condition
//            while (currentOR >= k) {
//                minLength = Math.min(minLength, end - start + 1);
//                currentOR &= ~nums[start];
//                start++;
//            }
//        }
//
//        // Return the minimum length found, or -1 if no valid subarray was found
//        return minLength == Integer.MAX_VALUE ? -1 : minLength;
        int length = 1;
        for(int digit:nums){
            if((digit) >= k){
                return length;
            }
        }
        int previousORValue = nums[0];
        for(int i=1; i<nums.length; i++){
            if((nums[i] | previousORValue) < k){
                previousORValue = nums[i] | previousORValue;
                length++;
            }else {
                length++;
                return length;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minimumSubarrayLength(new int[]{1, 2, 3}, 3));
        System.out.println(minimumSubarrayLength(new int[]{1, 2}, 0));
        System.out.println(minimumSubarrayLength(new int[]{2, 1, 8}, 10));
        System.out.println(minimumSubarrayLength(new int[]{1,2,32,21}, 55));
        System.out.println(minimumSubarrayLength(new int[]{2,32,21}, 55));
    }
}
