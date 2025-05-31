package InterviewQ;

import java.util.Objects;

public class Test {
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

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello   world "));
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("a good   example"));
    }
}
