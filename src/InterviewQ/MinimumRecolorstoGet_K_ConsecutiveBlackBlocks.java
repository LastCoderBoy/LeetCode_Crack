package InterviewQ;

public class MinimumRecolorstoGet_K_ConsecutiveBlackBlocks {
    private static int minimumRecolors(String blocks, int k) {
        int minOperations = blocks.length();
        int currentWhite = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentWhite++;
            }
        }
        minOperations = currentWhite;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                currentWhite--;
            }
            if (blocks.charAt(i) == 'W') {
                currentWhite++;
            }
            minOperations = Math.min(minOperations, currentWhite);
        }

        return minOperations;
    }

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW", 15));
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
        System.out.println(minimumRecolors("WBWBBBW", 2));
    }
}
