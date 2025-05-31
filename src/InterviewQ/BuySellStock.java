package InterviewQ;

public class BuySellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }

        int middleProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i <prices.length; i++){
            if(prices[i]<minValue){
                minValue = prices[i];
            }
            else if(prices[i] - minValue > middleProfit){
                middleProfit = prices[i] - minValue;
            }
        }

        return middleProfit;
    }
}
