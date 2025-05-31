package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroups {
    public static void main(String[] args) {
        System.out.println(getLongestSubsequence(
                new String[]{"a","b","c","d"},
                new int[]{1, 0, 1, 1}
        ));
        System.out.println(getLongestSubsequence(
                new String[]{"e","a","b"},
                new int[]{0, 0, 1}
        ));
        System.out.println(getLongestSubsequence(
                new String[]{"e"},
                new int[]{0}
        ));
    }

    private static List<String> getLongestSubsequence(String[] words, int[] groups) {
        // words = ["a","b","c","d"]
        // groups = [1, 0, 1, 1]

        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for(int i = 1; i<groups.length; i++){
            if(groups[i] != groups[i-1]){
                result.add(words[i]);
            }
        }
        return result;
    }

}
