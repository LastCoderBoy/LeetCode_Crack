package InterviewQ;

import java.util.*;

public class MergeTwo2DArrays {
    private static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // Note that the ID's are sorted.
//        Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
//        Output: [[1,6],[2,3],[3,2],[4,6]]


        TreeMap<Integer, Integer> resultHash = new TreeMap<>();

        for(int i=0; i< nums1.length; i++){
            resultHash.put(nums1[i][0], resultHash.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }

        for(int i=0; i< nums2.length; i++){
            resultHash.put(nums2[i][0], resultHash.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }


        int[][] result = new int[resultHash.size()][2];
        int inc = 0;
        for(Map.Entry<Integer, Integer> entry : resultHash.entrySet()){
            result[inc][0] = entry.getKey();
            result[inc][1] = entry.getValue();
            inc++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeArrays(
                new int[][]{{1, 2}, {2, 3}, {4, 5}},
                new int[][]{{1, 4}, {3, 2}, {4, 1}})));
        System.out.println(Arrays.deepToString(mergeArrays(
                new int[][]{{2, 4}, {3, 6}, {5, 5}},
                new int[][]{{1, 3}, {4, 3}})));
        System.out.println(Arrays.deepToString(mergeArrays(
                new int[][]{{1, 2}, {2, 3}},
                new int[][]{{1, 4}, {3, 2}, {4, 1}})));
        System.out.println(Arrays.deepToString(mergeArrays(
                new int[][]{{2, 2}},
                new int[][]{{1, 4}})));
    }
}
