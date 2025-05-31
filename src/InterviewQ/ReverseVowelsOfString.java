package InterviewQ;

import java.util.*;

public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int L = 0;
        int R = s.length()-1;
        while(L < R){
            if(vowels.contains(s.charAt(L)) && vowels.contains(s.charAt(R))){
                char Rtemp = s.charAt(R);
                char Ltemp = s.charAt(L);
                s = s.substring(0, L) + Rtemp + s.substring(L + 1);
                s = s.substring(0, R) + Ltemp + s.substring(R + 1);
                L++;
                R--;
            }
            else if(vowels.contains(s.charAt(L)) && !vowels.contains(s.charAt(R))){
                R--;
            }
            else{
                L++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }
}
