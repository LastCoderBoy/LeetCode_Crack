package InterviewQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> forMagazine = new HashMap<>();
        char[] magazineLetters = magazine.toCharArray();
        for(char letter: magazineLetters){
            forMagazine.put(letter, forMagazine.getOrDefault(letter, 0) + 1);
        }

        HashMap<Character, Integer> forRansom = new HashMap<>();
        char[] ransomeLetters = ransomNote.toCharArray();
        for(char letter: ransomeLetters){
            forRansom.put(letter, forRansom.getOrDefault(letter, 0) + 1);
        }
        boolean condition = false;
        for(char ransomKey:forRansom.keySet()){
            Integer values = forRansom.get(ransomKey);
            if(!(forMagazine.containsKey(ransomKey) && forMagazine.get(ransomKey) >= values)){
                condition = false;
                return condition;
            }
            else condition = true;
        }
        return condition;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("bcb", "cjjajdfaaeegig"));
    }
}
