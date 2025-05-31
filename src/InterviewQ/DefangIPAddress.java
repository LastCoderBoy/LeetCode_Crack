package InterviewQ;

public class DefangIPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddress("1.1.1.1"));
    }
    private static String defangIPaddress(String address) {
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"

        String[] digits = address.split("\\.");
        StringBuffer result = new StringBuffer();
        int inc = 0;
        for(String digit : digits){           
            result.append(digit);
            if(inc < digits.length-1) {
               result.append("[.]");
            }
            inc++;
        }
        return result.toString();
    }
}
