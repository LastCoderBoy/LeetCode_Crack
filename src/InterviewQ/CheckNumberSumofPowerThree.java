package InterviewQ;

public class CheckNumberSumofPowerThree {
     static int temp;
     static int previousPower;
     static boolean condition = true;
    private static boolean checkPowersOfThree(int n) {
        int remainder = 0;
         temp = n;
         while(temp > 0){
             temp /= 3;
             remainder++;
         }
         if(previousPower == remainder && previousPower != 0){
             condition = false;
             return condition;
         }
         if(n == 0) {
             condition = true;
             return condition;
         }
         previousPower = remainder;
         checkPowersOfThree((int) (n-Math.pow(3, previousPower-1)));
         temp = 0;
         previousPower = 0;
         return condition;
    }

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(10));
        System.out.println(checkPowersOfThree(13));
        System.out.println(checkPowersOfThree(12));
        System.out.println(checkPowersOfThree(91));
        System.out.println(checkPowersOfThree(21));
        System.out.println(checkPowersOfThree(0));
        System.out.println(checkPowersOfThree(7));
    }
}
