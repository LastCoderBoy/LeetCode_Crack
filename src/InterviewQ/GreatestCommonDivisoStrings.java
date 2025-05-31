package InterviewQ;

public class GreatestCommonDivisoStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int bigLength = 0, smallLength=0;
        String gcdText = "";
        boolean condition = true;
        if(str1.length() > str2.length()){
            bigLength = str1.length();
            smallLength = str2.length();
        }
        else {
            condition = false;
            bigLength = str2.length();
            smallLength = str1.length();
        }

        if(bigLength % smallLength == 0){
            int count = bigLength / smallLength;
            String repeated = null;
            if(condition) {
                repeated = str2.repeat(count);
                if(repeated.equals(str1)){
                    gcdText = str2;
                }
            }
            else {
                repeated = str1.repeat(count);
                if(repeated.equals(str2)){
                    gcdText = str1;
                }
            }
        }
        else {
            int gcd = GCD(str1.length(), str2.length());
            String subRepeated = null;
            if(condition) {
                subRepeated = str2.substring(0,gcd);
                String repeated = subRepeated.repeat(str1.length()/gcd);
                if(repeated.equals(str1)){
                    gcdText = subRepeated;
                }
            }
            else {
                subRepeated = str1.substring(0,gcd);
                String repeated = subRepeated.repeat(str2.length()/gcd);
                if(repeated.equals(str2)){
                    gcdText = subRepeated;
                }
            }
        }

        return gcdText;
    }
    public static int GCD(int num1, int num2){
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
