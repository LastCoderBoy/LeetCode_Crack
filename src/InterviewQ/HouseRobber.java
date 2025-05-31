package InterviewQ;

public class HouseRobber {
    private static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int maxAmount=dp[1];
        for(int i=2; i<nums.length; i++){
            maxAmount = Math.max(dp[i-1], dp[i-2] + nums[i]);
            dp[i] = maxAmount;
        }
        return maxAmount;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1,4}));
        System.out.println(rob(new int[]{2,7,9,3,1}));
        System.out.println(rob(new int[]{1,2,3,1}));
        System.out.println(rob(new int[]{5}));
    }
}
