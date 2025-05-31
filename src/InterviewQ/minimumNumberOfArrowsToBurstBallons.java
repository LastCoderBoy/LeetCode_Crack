package InterviewQ;

import java.util.Arrays;

public class minimumNumberOfArrowsToBurstBallons {
    public static int findMinArrowShots(int[][] points) {
        // [[1,6], [2,8], [7,12], [10,16]]
        if (points.length == 0) return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int numOfArrows = 1;
        int currentYaxis = points[0][1];
        for(int i=1; i<points.length; i++){
            if(currentYaxis >= points[i][0] && currentYaxis<=points[i][1]){
            }else {
                currentYaxis = points[i][1];
                numOfArrows++;
            }
        }
        return numOfArrows;
    }

    public static void main(String[] args) {
        System.out.println(findMinArrowShots(
                new int[][]{
                        {1,6}, {2,8}, {10,16}, {7,12}
                }
        ));
        System.out.println(findMinArrowShots(
                new int[][]{
                        {1,2}, {3,4}, {5,6}, {7,8}
                }
        ));
    }
}
