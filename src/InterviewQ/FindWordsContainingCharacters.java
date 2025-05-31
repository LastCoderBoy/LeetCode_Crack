package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacters {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a'));
        System.out.println(findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'z'));
    }

    private static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int counter = -1;
        for(String word : words){
            counter++;
            if(word.contains(String.valueOf(x))){
                result.add(counter);
            }
        }
        return result;
    }
}
