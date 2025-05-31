package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
//        ************ LINKED LIST ************
//        LinkedList<Integer> helperList = new LinkedList<>();
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] % 2 == 0){
//                helperList.addFirst(nums[i]);
//            }else {
//                helperList.add(nums[i]);
//            }
//        }
//        return helperList.stream().mapToInt(Integer::intValue).toArray();
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 2, 1, 4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 3, 1, 4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 1})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 2, 5, 9, 6})));
    }
}
