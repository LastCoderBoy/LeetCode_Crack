package InterviewQ;

public class LastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println("Test 1: " + lengthOfLastWord("Hello World"));
        System.out.println("Test 2: " + lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("Test 3: " + lengthOfLastWord(" luffy is still joyboy"));
    }

}
