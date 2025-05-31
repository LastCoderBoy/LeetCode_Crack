package InterviewQ;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
    }


    private static String countAndSay(int n){
        StringBuilder result = new StringBuilder();
        String encodedNumber = "1";
        while(n>1){
            encodedNumber = encode(encodedNumber);
            n--;
        }
        return result.append(encodedNumber).toString();
    }

    private static String decode(String number){
        StringBuilder decodedNumber = new StringBuilder();
        int realDigit = 1;
        for(int i = 0; i < number.length(); i +=2){
            int quantity = Integer.parseInt(String.valueOf(number.charAt(i)));
            for(int j=0; j<quantity; j++){
                decodedNumber.append(number.charAt(realDigit));
            }
            realDigit += 2;
        }

        return decodedNumber.toString();
    }
    private static String encode(String number){
        StringBuilder encodedNumber = new StringBuilder();
        int counter = 1;
        for(int i=0; i<=number.length()-1; i++){
            if(i < number.length() -1 ) {
                if (number.charAt(i) == number.charAt(i + 1)) {
                    counter++;
                }
                else {
                    encodedNumber.append(counter).append(number.charAt(i));
                    counter = 1;
                }
            }
            else {
                encodedNumber.append(counter).append(number.charAt(i));
            }
        }
        return encodedNumber.toString();
    }
}
