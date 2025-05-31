package InterviewQ;

import java.util.Arrays;

public class HeightChecker {
    private static int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        System.arraycopy(heights,0,expected,0,heights.length);
        Arrays.sort(expected);
        //sortArray(expected);
        int totalIndices = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != expected[i]){
                totalIndices++;
            }
        }
        return totalIndices;
    }

    private static void sortArray(int[] array){
        for(int i=0; i<array.length-1; i++) {
            for(int j=1; j<array.length-i; j++ ) {
                if(array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
    }
}
