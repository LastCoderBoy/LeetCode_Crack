package InterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        TreeSet<Integer> sortedUniqueNums = new TreeSet<>();
        for(int i:nums){
            sortedUniqueNums.add(i);
        }
        if(sortedUniqueNums.size() == 1) return 1;
        int count =1, result =0;
        boolean condition = false;
        for(int i : sortedUniqueNums){
            if(sortedUniqueNums.contains(i+1)){
                count++;
                condition = true;
            }
            else {
                result = Math.max(count, result);
                count=1;
            }
        }
        if(result == 1 && !condition) return 0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{-6,-1,-1,9,-8,-6,-6,4,4,-3,-8,-1}));
        System.out.println(longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println(longestConsecutive(new int[]{100,5,200,1,3,7}));
//        System.out.println(longestConsecutive(new int[]{0,0}));
//        System.out.println(longestConsecutive(new int[]{0,-1}));
    }
}
