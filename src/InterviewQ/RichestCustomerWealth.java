package InterviewQ;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{
                {1,2,3},
                {1,2,3,4}
        }));
    }
    private static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int i=0; i<accounts.length; i++){
            int customerWealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                customerWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }

        return maxWealth;
    }
}
