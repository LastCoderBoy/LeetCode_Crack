package InterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates test = new RemoveDuplicates();
        System.out.println(test.removeDuplicates(new int[]{0, 0, 4, 2, 2, 2, 1, 1, 4, 4}));
        System.out.println(test.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        for(int i=0; i<nums.length; i++){
            uniqueSet.add(nums[i]);
        }
        Iterator itr = uniqueSet.iterator();

        int inc = 0;
        while (itr.hasNext()){
            nums[inc] = (int) itr.next();
            inc++;
        }
        return uniqueSet.size();
    }
}
