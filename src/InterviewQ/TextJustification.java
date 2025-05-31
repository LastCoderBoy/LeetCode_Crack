package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        System.out.println("Test 1: " + fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justifiedList = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int numOfLetters = 0, spacesToSeparate=0;

        for(String word : words){
            if(word.length() < maxWidth){
                currentLine.add(word);
                numOfLetters = currentLine.size();
            }
            spacesToSeparate = maxWidth - numOfLetters;
        }


        return justifiedList;
    }
}
