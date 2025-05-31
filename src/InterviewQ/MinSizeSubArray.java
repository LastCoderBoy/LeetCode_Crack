package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int totalCount = 1;
        int maxNumAmongNums = nums[0];
        Arrays.sort(nums);

        List<Integer> convertedNums = new ArrayList<>();
        for (int num : nums){
            convertedNums.add(num);
        }
        if(convertedNums.contains(target))return totalCount;

        // [1, 2, 2, 3, 3, 4]

        for(int i=0; i<convertedNums.size(); i++){
            if(convertedNums.get(i)<target){
                maxNumAmongNums = Math.max(maxNumAmongNums, convertedNums.get(i));
            }
        }
        int remainingPart = target - maxNumAmongNums;
        int realPart = remainingPart;
        int remaingSum =0;
        while(remainingPart > 0){
            if(convertedNums.contains(remainingPart) && remainingPart != maxNumAmongNums){
                remaingSum += remainingPart;
                if(remaingSum == realPart) {
                    totalCount += 1;
                    return totalCount;
                }
                else if(remaingSum > realPart){
                    remaingSum -=remainingPart;
                    totalCount += 1;
                }
            }
            remainingPart--;
        }
        return  0;
    }

    public static void main(String[] args) {
        MinSizeSubArray minSize = new MinSizeSubArray();
        System.out.println(minSize.minSubArrayLen(15, new int[]{1,2,3, 4, 5}));
//        System.out.println(minSize.minSubArrayLen(7, new int[]{1, 2, 2, 3, 3, 4}));
//        System.out.println(minSize.minSubArrayLen(4, new int[]{1, 4, 4}));
//        System.out.println(minSize.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }
}
