package InterviewQ;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int[] yArray = new int[nums.length/2];
        System.arraycopy(nums,n, yArray,0,n);
        int counter = 0;
        for(int i=0; i<nums.length/2; i++){
            result[counter] = nums[i];
            result[counter + 1] = yArray[i];
            counter+=2;
        }
        return result;
    }
}
