package InterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> zeroRowsIndex = new HashSet<>();
        Set<Integer> zeroColumnsIndex = new HashSet<>();
        for(int row=0; row<matrix.length; row++){
            for(int column=0; column<matrix[row].length; column++){
                if (matrix[row][column] == 0) {
                    zeroRowsIndex.add(row);
                    zeroColumnsIndex.add(column);
                }

            }
        }

        for(int row=0; row<matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (zeroRowsIndex.contains(row) || zeroColumnsIndex.contains(column)) {
                    matrix[row][column] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        setZeroes(new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1}
        });
    }
}
