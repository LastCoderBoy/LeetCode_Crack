package InterviewQ;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindAllNumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        //count the frequencies for each number
        for(int i = 0 ; i < n ; i++){
            freq[nums[i]]++;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 1 ;i <= n; i++){
            if(freq[i] == 0){
                list.add(i);
            }
        }
        return list;
//        ************** ANOTHER SOLUTION **************
//        TreeSet<Integer> uniqueNums = new TreeSet<>();
//        List<Integer> result = new ArrayList<>();
//        for(int i:nums){
//            uniqueNums.add(i);
//        }
//        for(int i = 1; i <= nums.length; i++){
//            if(!uniqueNums.contains(i)) {
//                result.add(i);
//            }
//        }
//        return result;
    }

    public static void main(String[] args) {
        //System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
    }
}
