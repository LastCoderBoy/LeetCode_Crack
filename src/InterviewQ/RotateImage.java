package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                if(j<n/2) {
                    int temp = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));


    }

    public static void main(String[] args) {
        rotate(new int[][]{
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,12},
                {5,2,1,0}
        });
        rotate(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });
    }
}
