package InterviewQ;

public class ScoreOfString {
    private static int scoreOfString(String s) {
        int total = 0;
        for(int i=1; i<s.length(); i++){
            int current = s.charAt(i), previous = s.charAt(i-1);
            total += Math.abs(previous - current);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }
}
