package InterviewQ;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("ab@a"));
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }

    public static boolean isPalindrome(String s) {
        //  A man, a plan, a canal: Panama

        String[] formatted = s.split("[,\\\\.!\\s:\"'{}\\[\\]#@\\\\?<>.]+");
        StringBuilder forward = new StringBuilder();
        StringBuilder backward = new StringBuilder();
        for(String word:formatted){
            forward.append(word.toLowerCase());
        }
        String real = forward.toString();
        backward = forward.reverse();
        if(backward.toString().equals(real)){
            return true;
        }
        return false;
    }
}
