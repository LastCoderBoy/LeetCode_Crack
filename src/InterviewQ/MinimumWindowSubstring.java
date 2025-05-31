package InterviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        // Frequency maps for characters in t
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // Variables to track the window
        int left = 0, right = 0, matchedCount = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        Map<Character, Integer> windowMap = new HashMap<>();

        while (right < s.length()) {
            char endChar = s.charAt(right);
            windowMap.put(endChar, windowMap.getOrDefault(endChar, 0) + 1);

            // Check if current character contributes to a valid match
            if (tMap.containsKey(endChar) && windowMap.get(endChar).equals(tMap.get(endChar))) {
                matchedCount++;
            }

            // When all characters are matched, try to shrink the window
            while (matchedCount == tMap.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char startChar = s.charAt(left);
                windowMap.put(startChar, windowMap.get(startChar) - 1);

                // Update match count if a needed character count falls below
                if (tMap.containsKey(startChar) && windowMap.get(startChar) < tMap.get(startChar)) {
                    matchedCount--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // Expected output: "BANC"
    }

}
