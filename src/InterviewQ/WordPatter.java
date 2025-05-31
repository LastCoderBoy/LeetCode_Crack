package InterviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class WordPatter {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> match = new HashMap<>();
        char[] letters = pattern.toCharArray();
        String[] arrayWords = s.split(" ");
        if(letters.length != arrayWords.length) return false;

        for(int i=0; i<letters.length; i++){
            if((match.containsValue(arrayWords[i]) || match.containsKey(letters[i]))
                    && !Objects.equals(match.get(letters[i]), arrayWords[i])){
                return false;
            }
            match.put(letters[i],arrayWords[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("aaa", "aa aa aa aa"));
//        System.out.println(wordPattern("abba", "dog cat cat fish"));
//        System.out.println(wordPattern("abba", "dog cat cat dog"));
//        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }
}
