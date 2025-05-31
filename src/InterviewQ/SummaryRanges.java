package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }
        int beginning = nums[0], ending=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]-1 == nums[i-1]){
                ending = nums[i];
            }
            else if (beginning==ending){
                result.add(String.valueOf(beginning));
                beginning = nums[i];
                ending = nums[i];
            }
            else {
                result.add(beginning + "->" + ending);
                beginning = nums[i];
                ending = nums[i];
            }
        }
        if(beginning == nums[nums.length-1]) result.add(String.valueOf(beginning));
        else result.add(beginning + "->" + ending);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
        System.out.println(summaryRanges(new int[]{1, 2, 3, 4, 6, 7, 8, 10}));
    }
}
