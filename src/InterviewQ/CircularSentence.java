package InterviewQ;

public class CircularSentence {
    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        char initialLetter = words[0].charAt(0);
        char lastLetter = words[words.length-1].charAt(words[words.length-1].length()-1);
        if(initialLetter != lastLetter) return false;
        for(int i=1; i<words.length; i++){
            if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
        System.out.println(isCircularSentence("I like Leetcode"));
    }
}
