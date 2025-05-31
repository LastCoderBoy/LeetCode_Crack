package InterviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FancyString {
    public static String makeFancyString(String s) {
        StringBuilder fancyString = new StringBuilder();
        int consecutiveCount = 1;

        // Add the first character by default
        fancyString.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            // If current character is the same as the previous one
            if (s.charAt(i) == s.charAt(i - 1)) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1; // Reset count if character changes
            }

            // Only add if consecutive count is less than 3
            if (consecutiveCount < 3) {
                fancyString.append(s.charAt(i));
            }
        }

        return fancyString.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaaa"));
        System.out.println(makeFancyString("leeetcode"));
    }
}
