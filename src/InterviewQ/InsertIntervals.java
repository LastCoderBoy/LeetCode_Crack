package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertIntervals {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
            // intervals is sorted, ASC order.
        ArrayList<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        // Step 1: Add all intervals that come before the new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Step 3: Add all intervals that come after the new interval
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(insert(new int[][]{
                {1, 3}, {6, 9}},
                new int[]{2, 5})));

        System.out.println(Arrays.deepToString(insert(new int[][]{
                        {1, 2}, {3,5},{6,7},{8,10},{12,16}},
                new int[]{4,8})));
    }
}
