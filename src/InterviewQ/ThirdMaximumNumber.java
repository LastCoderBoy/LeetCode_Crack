package InterviewQ;

import java.util.Collections;
import java.util.TreeSet;

public class ThirdMaximumNumber {
    private static int thirdMax(int[] nums) {
//        TreeSet<Integer> reverseArray = new TreeSet<>(Collections.reverseOrder());
//        for(int i:nums){
//            reverseArray.add(i);
//        }
//        if(reverseArray.size() < 3) return reverseArray.first();
//        int inc =0, found=0;
//        for(int i: reverseArray){
//            inc++;
//            if(inc == 3){
//                found = i;
//            }
//        }
//        return found;
        long fmax = Long.MIN_VALUE, smax = Long.MIN_VALUE, tmax = Long.MIN_VALUE;
        for (int num : nums) {
            if (num == fmax || num == smax || num == tmax) continue; // Skip duplicates

            if (num > fmax) {
                tmax = smax;
                smax = fmax;
                fmax = num;
            } else if (num > smax) {
                tmax = smax;
                smax = num;
            } else if (num > tmax) {
                tmax = num;
            }
        }
        return (tmax == Long.MIN_VALUE) ? (int) fmax : (int) tmax;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,3,1}));
        System.out.println(thirdMax(new int[]{1,2}));
        System.out.println(thirdMax(new int[]{5}));
        System.out.println(thirdMax(new int[]{3,2,1}));
    }
}
