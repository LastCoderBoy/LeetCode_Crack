package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class SubsetXORSUM {
    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{5, 1, 6}));
        System.out.println(subsetXORSum(new int[]{3,4,5,6,7,8}));
    }

    private static int subsetXORSum(int[] nums) {
        int total = 0;
        List<List<Integer>> allSubset = subset(nums);
        int subsetSize = allSubset.size();

        for(int i=0; i<subsetSize; i++){
            int xorResult = 0;
            for(int j=0; j<allSubset.get(i).size(); j++){
                xorResult ^= allSubset.get(i).get(j);
            }
            total += xorResult;
        }

        return total;
    }

    private static List<List<Integer>> subset(int[] originalArray) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : originalArray) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> currentSubset = new ArrayList<>(result.get(i));
                currentSubset.add(num);
                result.add(currentSubset);
            }
        }

        return result;
    }

}
