package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumXOR {
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        // [0, 1, 1, 3]
        int n = nums.length;
        int xorr = nums[0];
        int maxXor = (1 << maximumBit) - 1;

        for (int i = 1; i < n; i++) {
            xorr ^= nums[i];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = xorr ^ maxXor;
            xorr ^= nums[n - 1 - i];
        }

        return ans;
    }

//    public static int unknownValue(int[] nums, int length, int maxBit) {
//        int k = (int) (Math.pow(2, maxBit) - 1);
//        int XORvalue = 0;
//
//        for (int i = 0; i < length; i++) {
//            XORvalue ^= nums[i];
//        }
//        return XORvalue ^ k;
//    }

//    public static String decimalToBinary(int num) {
//        StringBuilder binary = new StringBuilder();
//        if (num == 0) {
//            return "0";
//        }
//
//        while (num > 0) {
//            int remainder = num % 2;
//            binary.insert(0, remainder);
//            num /= 2;
//        }
//        return binary.toString();
//    }
//    public static int binaryToDecimal(String binary) {
//        int decimal = 0;
//        int length = binary.length();
//
//        for (int i = 0; i < length; i++) {
//            char bit = binary.charAt(i);
//
//            if (bit == '1') {
//                decimal += (int) Math.pow(2, length - 1 - i);
//            }
//        }
//        return decimal;
//    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMaximumXor(new int[]{0, 1, 1, 3}, 2)));
    }
}
