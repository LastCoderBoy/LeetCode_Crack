package InterviewQ;

public class StringToInteger {
    public static int myAtoi(String s) {
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        StringBuffer finalResult = new StringBuffer();
        for(char c : s.toCharArray()){
            if((finalResult.toString().equals("-")) && (c == '0')){
                continue;
            }
            if(Character.isDigit(c)){
                finalResult.append(c);
            }
            else if(c == '-' && finalResult.isEmpty()){
                finalResult.append(c);
            }
            else if(c == '+' && finalResult.isEmpty()){
                continue;
            }
            else {
                break;
            }
        }
        long result = 0;
        if(!finalResult.isEmpty()) {
            if(!finalResult.toString().equals("-")) {
                result = Long.parseLong(finalResult.toString());
                if (result < Integer.MIN_VALUE) result = Integer.MIN_VALUE;
                if (result > Integer.MAX_VALUE) result = Integer.MAX_VALUE;
            }
        }
        return (int)result;
    }

    public static void main(String[] args) {
//        System.out.println(myAtoi("words and 987"));
//        System.out.println(myAtoi(""));
        System.out.println(myAtoi("+12"));
        System.out.println(myAtoi("-+12"));
        System.out.println(myAtoi("91283472332"));
        System.out.println(myAtoi(" -042c2"));
        System.out.println(myAtoi(" 0-1"));
        System.out.println(myAtoi(" 123c2"));
    }
}
