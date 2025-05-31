package InterviewQ;

import java.util.Arrays;

public class CountFairPairs {

    public static long countFairPairs(int[] nums, int lower, int upper) {
        long total = 0;
        int n = nums.length, L=0, R=n-1;
        Arrays.sort(nums); // [0, 1, 4, 4, 5, 7]

        for (int i = 0; i < n - 1; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                long sum = (long)nums[i] + nums[left];

                if (sum <= upper) {
                    // Find the rightmost index within the valid range
                    int rightBound = right;
                    while (rightBound >= left && (long)nums[i] + nums[rightBound] <= upper) {
                        rightBound--;
                    }
                    total += right - rightBound;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(countFairPairs(new int[]{0,1,7,4,4,5}, 3, 6));
        System.out.println(countFairPairs(new int[]{1,7,9,2,5}, 11, 11));
    }
}
