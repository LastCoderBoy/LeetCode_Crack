package InterviewQ;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement test = new MajorityElement();
        System.out.println(test.majorityElement((new int[]{3,2,3})));

    }
    public int majorityElement(int[] nums) {
        int rule = nums.length/2;
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int num:nums){
            store.put(num, store.getOrDefault(num,0)+1);
        }

        for(int val:store.keySet()){
            if(store.get(val)>rule){
                return val;
            }
        }
        return 0;
    }
}
