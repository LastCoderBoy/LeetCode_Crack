package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsII {
    public static void main(String[] args) {
        System.out.println(getLongestSubsequence(
                new String[]{"bab","dab","cab"},
                new int[]{1, 2, 2}
        ));
    }

    private static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i<groups.length; i++){
            if(i-1 == 0 || groups[i] != groups[i-1]){
                result.add(words[i-1]);
                boolean sameLeng = words[i].length() == words[i - 1].length();
                if(sameLeng){
                    if(hammingDistance(words[i], words[i-1]) == 1){
                        result.add(words[i]);
                    }
                }
            }
        }
        return result;
    }

    private static int hammingDistance(String word, String word1) {
        int distance = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) != word1.charAt(i)){
                distance++;
            }
        }
        return distance;
    }
}
