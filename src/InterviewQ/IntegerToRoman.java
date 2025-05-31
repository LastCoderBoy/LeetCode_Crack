package InterviewQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

    public static void main(String[] args) {
//        System.out.println("Test 1: " + intToRoman(3749));
//        System.out.println("Test 1: " + intToRoman(58));
        System.out.println("Test 2: " + intToRoman(1994));
    }
    private static final Map<Integer, String> romans = new LinkedHashMap<>();
    static {
        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");
    }
    private static String intToRoman(int num) {
        String result = "";

        for (Map.Entry<Integer, String> entry : romans.entrySet()) {
            while (num >= entry.getKey()) {
                result += entry.getValue();
                num -= entry.getKey();
            }
        }
        return result;
    }
}
