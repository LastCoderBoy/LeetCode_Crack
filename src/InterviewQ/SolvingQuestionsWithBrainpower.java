package InterviewQ;

public class SolvingQuestionsWithBrainpower {

    public static void main(String[] args) {
        System.out.println(mostPoints(new int[][]{
                {3,2}, {4,3}, {4,4}, {2,5}
        }));
        System.out.println(mostPoints(new int[][]{
                {1,1}, {2,2}, {3,3}, {4,4}, {5,5}
        }));
        System.out.println(mostPoints(new int[][]{
                {12,46},{78,19},{63,15},{79,62},{13,10}
        }));
    }
    private static long mostPoints(int[][] questions) {
        long n = questions.length;
        long[] dp = new long[Math.toIntExact(n + 1)];
        for(int i = Math.toIntExact(n - 1); i>=0; i--){
            long points = questions[i][0];
            long skip = questions[i][1];
            int nextQuestion = Math.toIntExact(i + skip + 1);
            long solved;
            if(nextQuestion <= n) solved = points + dp[nextQuestion];
            else solved = points;
            long lastMaxValIfNoCurrent = dp[i+1];

            dp[i] = Math.max(lastMaxValIfNoCurrent, solved);
        }
        return dp[0];       // Max of solving or skipping
    }
}
