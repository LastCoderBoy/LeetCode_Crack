package InterviewQ;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {

        if(nums.length==1)
            return 1;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;

//        ************ DOWN BELOW IS ANOTHER SOLUTION ************
//        // 1 <= nums.leng <= 30000
//
//        int[] tempArray = new int[nums.length];
//        int initial = nums[0];
//        int pos =0;
//        tempArray[pos] = initial;
//        pos++;
//        for(int i=1; i<nums.length; i++){
//            if(nums[i] == initial ) continue;
//            else{
//                tempArray[pos] = nums[i];
//                initial = nums[i];
//            }
//            pos++;
//        }
//        System.arraycopy(tempArray, 0, nums, 0, pos);
//        System.out.println(Arrays.toString(nums));
//        return pos;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,2,3,3,4}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{1,2,2, 5,5,6,7,7,9,9,10}));
        System.out.println(removeDuplicates(new int[]{1}));
    }
}
