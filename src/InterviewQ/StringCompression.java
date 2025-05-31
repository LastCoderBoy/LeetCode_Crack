package InterviewQ;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringCompression {
    public static String compressedString(String word) {
        StringBuffer comp = new StringBuffer();
        char[] charArray = word.toCharArray();
        char temp = charArray[0];

        LinkedHashMap<Character, Integer> letters = new LinkedHashMap<>();
        letters.put(temp, 1);

        for (int i = 1; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == temp) {
                letters.put(c, letters.getOrDefault(c, 0) + 1);
                if (letters.get(c) == 9) {
                    comp.append(9).append(c);
                    letters.remove(c); // Reset after reaching 9
                }
            } else {
                // Append previous character and count, then reset for new character
                if (letters.containsKey(temp)) {
                    comp.append(letters.get(temp)).append(temp);
                    letters.remove(temp);
                }
                letters.put(c, 1);
                temp = c;
            }
        }

        // Append any remaining character and its count
        if (!letters.isEmpty()) {
            comp.append(letters.get(temp)).append(temp);
        }

        return comp.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressedString("aaaaaaaaay"));      // Expected output: 9a1y
        System.out.println(compressedString("aabbaccd"));        // Expected output: 2a2b1a2c1d
        System.out.println(compressedString("aaaaaaaaaabbaccd")); // Expected output: 9a2a2b1a2c
    }
}
