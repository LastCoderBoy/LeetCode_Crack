package InterviewQ;

import java.util.*;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        RemoveDuplicatesII test = new RemoveDuplicatesII();
        System.out.println(test.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    public int removeDuplicates(int[] nums) {
        int count =0;
        for (final int num : nums){
            if(count < 2 || num > nums[count-2] ){
                nums[count++] = num;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
