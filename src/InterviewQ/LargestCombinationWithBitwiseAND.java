package InterviewQ;

import java.util.Arrays;

public class LargestCombinationWithBitwiseAND {
    public static int largestCombination(int[] candidates) {
        int maxCombination = 0;

        // Check each bit position (up to 32 bits for an integer)
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            // Count how many numbers have the current bit set to 1
            for (int num : candidates) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            // Update maxCombination with the largest count of numbers with any bit set
            maxCombination = Math.max(maxCombination, count);
        }

        return maxCombination;
    }

    public static int decimalToBinary(int num) {
        int binary = 0;
        int place = 1;

        // Number should be positive
        while (num > 0) {
            int remainder = num % 2;
            binary += remainder * place;
            place *= 10;
            num /= 2;
        }

        return binary;
    }


    public static void main(String[] args) {
        System.out.println(largestCombination(new int[]{8,8}));
        System.out.println(largestCombination(new int[]{16,17,71,62,12,24,14}));
    }
}
