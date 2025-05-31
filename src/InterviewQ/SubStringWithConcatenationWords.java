package InterviewQ;

import java.util.*;

public class SubStringWithConcatenationWords {
    public static void main(String[] args) {
        System.out.println(findSubstring("barfoothefoobarman", new String[]{"bar", "foo"}));
        System.out.println(findSubstring("foobarfoobar", new String[]{"bar", "foo"}));
        System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
        System.out.println(findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
        System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}));
        System.out.println(findSubstring("fffffffffffffffffffffffffffffffff", new String[]{"a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a"}));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (words.length == 0 || s.length() == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int substringLength = wordLength * wordCount;

        // Frequency map for all words
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Traverse through the string with different start points
        for (int i = 0; i < wordLength; i++) {
            int left = i, right = i, count = 0;
            Map<String, Integer> currentCount = new HashMap<>();

            while (right + wordLength <= s.length()) {
                // Get the current word from the sliding window
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordFrequency.containsKey(word)) {
                    currentCount.put(word, currentCount.getOrDefault(word, 0) + 1);
                    count++;

                    // If there are more occurrences of "word" than needed, slide the window
                    while (currentCount.get(word) > wordFrequency.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        currentCount.put(leftWord, currentCount.get(leftWord) - 1);
                        count--;
                        left += wordLength;
                    }

                    // If the count matches the number of words, add the starting index
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    // Reset if the word is not part of words
                    currentCount.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return result;
    }
}
