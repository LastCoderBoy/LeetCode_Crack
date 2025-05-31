package InterviewQ;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charactersOfS = new HashMap<>();
        int length = s.length();
        HashMap<Character, Integer> charactersOfT = new HashMap<>();
        for(int i=0; i<length; i++) {
            if(!charactersOfS.containsKey(s.charAt(i))) {
                charactersOfS.put(s.charAt(i), i);
            }
            if(!charactersOfT.containsKey(t.charAt(i))) {
                charactersOfT.put(t.charAt(i), i);
            }
            if (!charactersOfS.get(s.charAt(i)).equals(charactersOfT.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    }
}
