package InterviewQ;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {
    public static int numTilePossibilities(String tiles) {
        // if tiles are distinct
        if(tiles.length() == 1) return 1;
        boolean isDistinct = true;
        Set<Character> set = new HashSet<>();
        for (char c : tiles.toCharArray()) {
            if (!set.add(c)) {
                isDistinct = false;
                break;
            }
        }
        int result = 0;
        if(isDistinct){
            int inc = 1;
            while(inc <= tiles.length()){
                result += calculateDistinctPermutation(tiles.length(), inc);
                inc++;
            }
            return result;
        }
        else {
            //if not distinct logic goes here
            Set<String> forms = new HashSet<>();
            generateSequences("", tiles, forms);
            return forms.size();
        }
    }
    private static void generateSequences(String current, String remaining, Set<String> forms) {
        if (!current.isEmpty()) {
            forms.add(current);
        }

        for (int i = 0; i < remaining.length(); i++) {
            generateSequences(current + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    forms);
        }
    }

    private static int calculateDistinctPermutation(int length, int inc) {
        return factorial(length) / factorial(length-inc);
    }

    private static int factorial(int length) {
        if(length == 0) return 1;
        else {
            return length * factorial(length - 1);
        }
    }

    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles)); // Output: 8
    }
}
