package InterviewQ;

import java.util.Arrays;

public class CommonPrefix {

    public static void main(String[] args) {
        System.out.println("Test 1: " + longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println("Test 2: " + longestCommonPrefix(new String[]{"phone","phonoe","phonai", "phonoroid"}));
        System.out.println("Test 3: " + longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println("Test 4: " + longestCommonPrefix(new String[]{"dog"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);
        if(strs.length == 1 || strs.length==0){
            return "";
        }

        // Get the lowest length of first and last strings
        int lowest = Math.min(strs[0].length(), strs[strs.length-1].length());
        int inc=0, i=0;
        while(inc<lowest && strs[0].charAt(inc) == strs[strs.length-1].charAt(inc)){
            result.append(strs[0].charAt(inc));
            inc++;
        }


        return String.valueOf(result);
    }
}
