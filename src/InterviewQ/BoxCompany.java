package InterviewQ;

public class BoxCompany {
    public static void main(String[] args) {
//        System.out.println(cutLeadingZeroes("001"));
//        System.out.println(codeHere(new int[]{-1, 4, 2, 3, 9}));
//        System.out.println(codeHere(new int[]{-4, 2, 0, 3, -1}));
        System.out.println(minEditDistance("FOOD", "MONEY"));
        System.out.println(minEditDistance("FOMONEY", "MONEY"));
    }
    public static String cutLeadingZeroes(String param) {
        while (param.charAt(0) == '0') {
            param.substring(1);
        }
        return param;
    }

    public static int codeHere(int[] nums) {
        int min = nums[0]; // Assuming 0 element in the array is closest
        for(int i=0; i<nums.length; i++){
            min = Math.min(min, Math.abs(0-Math.abs(nums[i])));
        }
        return min;
    }

    public static int minEditDistance(String starter, String target) {
        int m = starter.length();
        int n = target.length();

        // If one of the strings is empty, return the length of the other string
        if (m == 0) return n;
        if (n == 0) return m;

        // Initialize a 1D array for storing the DP results
        int[] dp = new int[n + 1];

        // Initialize base cases (when starter is empty)
        for (int j = 0; j <= n; j++) {
            dp[j] = j; // cost of converting an empty starter to target[0..j]
        }

        // Start filling the dp array for each character in starter
        for (int i = 1; i <= m; i++) {
            int prev = dp[0];  // Storing the dp value for later use
            dp[0] = i;  // Cost of converting starter to an empty target

            for (int j = 1; j <= n; j++) {
                int temp = dp[j];  // Store current value before updating it

                // If characters match, no operation needed
                if (starter.charAt(i - 1) == target.charAt(j - 1)) {
                    dp[j] = prev;  // No edit needed, carry over previous value
                } else {
                    dp[j] = Math.min(Math.min(dp[j - 1], dp[j]) + 1, prev + 1);  // min(insert, delete, replace)
                }

                prev = temp;  // Move to next character
            }
        }

        return dp[n];
    }
}
