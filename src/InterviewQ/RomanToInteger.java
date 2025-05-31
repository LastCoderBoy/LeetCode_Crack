package InterviewQ;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
//        System.out.println("Test 1: " + romanToInt("III"));
//        System.out.println("Test 1: " + romanToInt("IV"));
        System.out.println("Test 2: " + romanToInt("MCMXCIV"));
    }

    private static final HashMap<String, Integer> romans = new HashMap<>();

    static {
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);
    }
    public static int romanToInt(String s) {


        String[] letters = s.split("");
        int result = romans.get(letters[letters.length-1]);

        for(int i=letters.length-2; i>=0;i--){
            if(romans.get(letters[i]) < romans.get(letters[i+1])){
                result -= romans.get(letters[i]);
            }
            else {
                result += romans.get(letters[i]);
            }
        }

        return result;
    }
}
