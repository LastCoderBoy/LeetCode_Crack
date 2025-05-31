package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class HackerRank_2 {
    public static String compressWord(String word, int k) {
        // Remove the consecutive letters
        // raacccdbqqb k=3

        boolean condition = false;
        List<Character> letters = new ArrayList<>();
        StringBuffer result = new StringBuffer();
        for(char c: word.toCharArray()){
            letters.add(c);
        }
        int i = 0;
        while (i <= letters.size() - k) {
            boolean isConsecutive = true;
            for (int j = 1; j < k; j++) {
                if (!letters.get(i).equals(letters.get(i + j))) {
                    isConsecutive = false;
                    break;
                }
            }

            if (isConsecutive) {
                // Remove the consecutive letters
                letters.subList(i, i + k).clear();
                // Reset index to handle new consecutive groups after removal
                i = Math.max(0, i - k);
            } else {
                i++;
            }
        }

        for(char s : letters){
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressWord("xyzzyd", 2));
        System.out.println(compressWord("raacccdbqqb", 3));
        System.out.println(compressWord("bqqb", 2));
    }
}
