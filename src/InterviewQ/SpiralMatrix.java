package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<>();

        int top = 0, right = matrix[0].length-1,
                bottom = matrix.length-1, left = 0;
        int direction = 1;
        while(right>=left && bottom>=top){
            // Left -> Right
            if(direction == 1){
                for(int i=left; i<=right; i++){
                    spiralList.add(matrix[top][i]);
                }
                top++;
                direction=2;
            }
            // Top -> Bottom
            else if (direction == 2){
                for(int i=top; i<=bottom; i++){
                    spiralList.add(matrix[i][right]);
                }
                right--;
                direction=3;
            }
            // Right -> Left
            else if(direction == 3){
                for(int i=right; i>=left; i--){
                    spiralList.add(matrix[bottom][i]);
                }
                bottom--;
                direction=4;
            }
            // Bottom -> Top
            else if(direction==4){
                for (int i = bottom; i >= top; --i) {
                    spiralList.add(matrix[i][left]);
                }
                left++;
                direction=1;
            }
        }
        return spiralList;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }));
        System.out.println(spiralOrder(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        }));
    }
}
