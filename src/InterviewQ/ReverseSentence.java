package InterviewQ;

import java.util.Arrays;
import java.util.Objects;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println("Test 1: " + reverseWords(" Sky is   blue"));
        System.out.println("Test 2: " + reverseWords("  hello world  "));
        System.out.println("Test 3: " + reverseWords("a good   example"));

    }
    public static String reverseWords(String s) {
        StringBuffer result = new StringBuffer();
        s = s.trim();
        String[] words = s.split(" ");
        for(int i=words.length-1; i>=0; i--){
            if(!Objects.equals(words[i], ""))
                result.append(words[i]).append(" ");
        }

        return result.toString().trim();
    }

}
