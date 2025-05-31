package InterviewQ;

public class StrictlyPalindrome {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9));
        System.out.println(isStrictlyPalindromic(4));
    }

    private static boolean isStrictlyPalindromic(int n) {
        // base: 2 ... n-2
        for(int i=2; i<= n-2; i++){
            int temp = n;
            StringBuilder forward = new StringBuilder();
            StringBuilder backward = new StringBuilder();
            while(temp > 0){
                 int remainder = temp % i;
                 temp /= i;
                 forward.append(remainder);
                 backward.insert(0,remainder);
            }
            if(!forward.toString().equals(backward.toString())){
                return false;
            }
        }
        return true;
    }
}
