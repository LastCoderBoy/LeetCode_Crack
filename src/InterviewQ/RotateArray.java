package InterviewQ;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{-1,-100, 3,99},2);
    }
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return;
        }

        int n = nums.length;
        k = k % n;

        int[] tempArray = new int[n];
        int start = 0;


        for (int i = n - k; i < n; i++) {
            tempArray[start] = nums[i];
            start++;
        }

        int tempK = k;
        for (int i = 0; i < n - k; i++) {
            tempArray[tempK] = nums[i];
            tempK++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArray[i];
        }


        System.out.println("Temp: " + Arrays.toString(tempArray));

    }
}
