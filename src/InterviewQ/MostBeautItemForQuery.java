package InterviewQ;

import java.util.Arrays;

public class MostBeautItemForQuery {
    public static int[] maximumBeauty(int[][] items, int[] queries) {
            int n = queries.length;
            int ans[] = new int[n];

            int[][]queryIndex = new int[n][2];
            for(int i=0; i<n; i++)
            {
                queryIndex[i][0] = queries[i];
                queryIndex[i][1] = i;
            }
            Arrays.sort(queryIndex, (a, b)->a[0]-b[0]);
            Arrays.sort(items, (a, b)-> a[0]-b[0]);


            int maxBeauty = 0;
            int itemIndex = 0;

            for(int i=0; i<n; i++)
            {
                int currIndex = queryIndex[i][1];
                int currPrice = queryIndex[i][0];
                while(itemIndex<items.length && currPrice>=items[itemIndex][0])
                {
                    maxBeauty = Math.max(maxBeauty, items[itemIndex][1]);
                    itemIndex++;
                }
                ans[currIndex] = maxBeauty;
            }

            return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maximumBeauty(new int[][]{
                {1, 2},
                {3, 2},
                {2, 4},
                {3, 5},
                {5, 6},
        }, new int[]{1, 2, 3, 4, 5, 6})));

        System.out.println(Arrays.toString(maximumBeauty(new int[][]{
                {10,1000},
        }, new int[]{5})));

        System.out.println(Arrays.toString(maximumBeauty(new int[][]{
                {1, 2},
                {1, 3},
                {1, 4},
                {1, 5},
                {1, 6},
        }, new int[]{1})));
    }
}
