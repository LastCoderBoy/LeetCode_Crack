package InterviewQ;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})));
        System.out.println(Arrays.toString(buildArray(new int[]{5,0,1,2,3,4})));
    }

    private static int[] buildArray(int[] nums) {
        int arrayLength = nums.length;
        int[] result = new int[arrayLength];

        for(int i=0; i<nums.length; i++){
            int innerIndex = nums[i];
            result[i] = nums[innerIndex];
        }
        return result;
    }
}
