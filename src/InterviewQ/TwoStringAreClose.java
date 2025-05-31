package InterviewQ;

import java.util.*;

public class TwoStringAreClose {
    private static boolean closeStrings(String word1, String word2) {
        if(word2.length() != word1.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<word1.length(); i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0)+1);
        }
        for(int i=0; i<word2.length(); i++){
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("abbzzca", "babzzcz"));
        System.out.println(closeStrings("abc", "bca"));
        System.out.println(closeStrings("a", "aa"));
        System.out.println(closeStrings("cabbba", "abbccc"));
        System.out.println(closeStrings("cabbbad", "qabbccc"));
    }
}
