package InterviewQ;

import java.util.Arrays;

public class FinalPriceWithSpecialDiscount {
    public static int[] finalPrices(int[] prices) {
        // [8, 4, 6, 2, 3]

        int[] answer = new int[prices.length];
        boolean condition = false;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j< prices.length; j++){
                if(prices[j] <= prices[i]){
                    answer[i] = prices[i] - prices[j];
                    condition = true;
                    break;
                }
                condition = false;
            }
            if(!condition) {
                answer[i] = prices[i];
                condition = false;
            }
        }
        if(condition && prices[prices.length-1] <= prices[prices.length-2]){
            answer[prices.length-1] = prices[prices.length-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{
                6,8,1,8,1,5,10,10,10
        })));System.out.println(Arrays.toString(finalPrices(new int[]{
                8,7,4,2,8,1,7,7,10,1
        })));
        System.out.println(Arrays.toString(finalPrices(new int[]{
                8, 4, 6, 2, 3
        })));
        System.out.println(Arrays.toString(finalPrices(new int[]{
                10,1,1,6
        })));
        System.out.println(Arrays.toString(finalPrices(new int[]{
                1,2,3,4,5
        })));
    }
}
