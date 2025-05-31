package InterviewQ;

import java.util.Arrays;
import java.util.TreeSet;

public class HouseRobberIV {
    private static int minCapability(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0, i = 0;
            while (i < nums.length) {
                if (nums[i] <= mid) {
                    count++;
                    i += 2;
                } else {
                    i++;
                }
            }

            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(minCapability(new int[]{9,6,20,21,8}, 3));
        System.out.println(minCapability(new int[]{2,3,5,9}, 2));
        System.out.println(minCapability(new int[]{2,7,9,3,1}, 2));
        System.out.println(minCapability(new int[]{3}, 1));
        System.out.println(minCapability(new int[]{3,3}, 2));
        System.out.println(minCapability(new int[]{5, 3, 4, 11, 2}, 2));
        System.out.println(minCapability(new int[]{7,1,8,11}, 1));
    }
}
