package InterviewQ;

import java.util.HashMap;

public class CountNumberOfBadPairs {
    public static long countBadPairs(int[] nums) {
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;
        long goodPairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i] - i;
            int count = map.getOrDefault(value, 0);
            goodPairs += count;
            map.put(value, count + 1);
        }

        return totalPairs - goodPairs;
    }

    public static void main(String[] args) {
        //System.out.println(countBadPairs(new int[]{4, 1, 3, 3}));
        System.out.println(countBadPairs(new int[]{1, 2, 3, 4, 5}));
    }
}
