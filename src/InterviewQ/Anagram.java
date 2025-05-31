package InterviewQ;

import java.util.HashMap;
import java.util.Objects;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> forS = new HashMap<>();
        HashMap<Character, Integer> forT = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            forS.put(s.charAt(i), forS.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            forT.put(t.charAt(i), forT.getOrDefault(t.charAt(i), 0)+1);
        }
        for(char key : forS.keySet()){
            if(!Objects.equals(forS.get(key), forT.get(key))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
