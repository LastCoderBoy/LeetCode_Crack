package InterviewQ;

public class BuySellStockII {
    public static void main(String[] args) {
        System.out.println("test 1: " + maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("test 2: " + maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println("test 3: " + maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;

    }
}
