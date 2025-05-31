package InterviewQ;

import java.util.Arrays;

public class FindNumWithoutPair {
    public static void main(String[] args) {
        System.out.println(find_unique(new int[]{42, 43, 44, 42, 44}));
        System.out.println(find_unique(new int[]{1, 1, 2, 3, 2}));
        System.out.println(find_unique(new int[]{42, 43, 44, 43, 44}));
    }
    private static int find_unique(int[] nums) {
        // write code here
        Arrays.sort(nums);
        int found = 0;
        for(int i = 0; i<nums.length; i++){
            if ((i == 0 || nums[i] != nums[i - 1]) && (i == nums.length - 1 || nums[i] != nums[i + 1])) {
                found = nums[i];
                break;
            }
        }
        return found;
    }
}
