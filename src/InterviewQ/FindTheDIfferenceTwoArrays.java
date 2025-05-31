package InterviewQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindTheDIfferenceTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> forNum1 = new HashSet<>();
        HashSet<Integer> forNum2 = new HashSet<>();
        for(int i : nums1){
            forNum1.add(i);
        }
        for(int i : nums2){
            forNum2.add(i);
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        Iterator<Integer> num1Iterator = forNum1.iterator();
        Iterator<Integer> num2Iterator = forNum2.iterator();

        while(num1Iterator.hasNext()){
            int num1 = num1Iterator.next();
            if(!forNum2.contains(num1)){
                list1.add(num1);
            }
        }
        while(num2Iterator.hasNext()){
            int num2 = num2Iterator.next();
            if(!forNum1.contains(num2)){
                list2.add(num2);
            }
        }
        result.add(list1);
        result.add(list2);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,1,2,3}, new int[]{2,4,4,5,6}));
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2,}));
    }
}
