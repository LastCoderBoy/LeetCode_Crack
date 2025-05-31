package InterviewQ;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;

public class IsSubsequence {
    public static boolean isSubsequenceMethod(String s, String t) {

        int i=0, j=0;
        while(j<t.length()){
            if(i<s.length() && (t.charAt(j)==s.charAt(i))){
                i++;
            }
            j++;
        }
        return (i==s.length())? true:false;

    }

    public static void main(String[] args) {
        // s = "axc", t = "ahbgdc"
        // s = "abc", t = "ahbgdc"
        System.out.println(IsSubsequence.isSubsequenceMethod("abc", "ahbgdc"));
        System.out.println(IsSubsequence.isSubsequenceMethod("acb", "ahbgdc"));
        System.out.println(IsSubsequence.isSubsequenceMethod("axc", "ahbgdc"));
    }
}
