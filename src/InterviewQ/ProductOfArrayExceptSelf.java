package InterviewQ;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println("test 1: " + Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println("test 2: " + Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
        //System.out.println("test 1: " + Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            answer[i] = 1;
            for(int j=0; j<answer.length; j++){
                if(i != j) {
                    answer[i] *= nums[j];
                }
            }
        }
        return answer;
    }
}
