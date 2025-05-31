package InterviewQ;

public class MinimumArrayEnd {
    public static long minEnd(int n, int x) {
        // Step 1: Find the binary representation of n-1
        long nMinusOne = n - 1;

        // Convert n-1 to binary string
        String binaryNMinusOne = Long.toBinaryString(nMinusOne);

        // Step 2: Convert x to binary string, ensuring it has the same length as the result after filling
        String binaryX = Long.toBinaryString(x);

        // Add leading zeroes to binaryX to match the length of nMinusOne's binary
        while (binaryX.length() < binaryNMinusOne.length()) {
            binaryX = "0" + binaryX;
        }

        // Step 3: Replace the zeroes in x's binary with the binary representation of n-1
        StringBuilder resultBinary = new StringBuilder(binaryX);
        int j = binaryNMinusOne.length() - 1; // Start from the rightmost bit of n-1's binary
        for (int i = resultBinary.length() - 1; i >= 0 && j >= 0; i--) {
            if (resultBinary.charAt(i) == '0') {
                resultBinary.setCharAt(i, binaryNMinusOne.charAt(j));
                j--;
            }
        }

        // Step 4: Convert the resulting binary string to decimal and return as long
        return Long.parseLong(resultBinary.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(minEnd(3,4));
        System.out.println(minEnd(2,7));
    }
}
