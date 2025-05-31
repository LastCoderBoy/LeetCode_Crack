package InterviewQ;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        System.out.println("Test 1: " + strStr("sadbutsad", "sad"));
        System.out.println("Test 2: " + strStr("leetcode", "leeto"));
        System.out.println("Test 3: " + strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }

        return haystack.indexOf(needle);
//
//        int lowest = needle.length();
//        int inc=0;
//        while(haystack.charAt(inc) == needle.charAt(inc)){
//            inc++;
//        }
//        return inc-needle.length();
    }
}
