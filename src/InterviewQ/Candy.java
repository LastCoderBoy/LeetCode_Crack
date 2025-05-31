package InterviewQ;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        System.out.println("Test 1: " + candy(new int[]{1,0,2}));
        System.out.println("Test 2: " + candy(new int[]{1,2,2}));
        System.out.println("Test 3: " + candy(new int[]{1,3,2,2,1}));
    }
    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int minCandies = 0;
        for(int i=0; i<candies.length; i++){
            candies[i] = 1;
        }
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i-1])  candies[i] = Math.max(candies[i], candies[i-1] + 1);
        }
        for(int i=ratings.length-2; i>=0;i--){
            if(ratings[i] > ratings[i+1])  candies[i] = Math.max(candies[i], candies[i+1] + 1);
        }
//        for(int can : candies){
//            minCandies +=can;
//        }
        System.out.println(Arrays.toString(candies));
        return minCandies;
    }
}
