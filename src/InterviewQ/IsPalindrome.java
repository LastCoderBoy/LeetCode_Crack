package InterviewQ;

import java.util.Arrays;

public class IsPalindrome {
    public boolean checkPalindrome(int x) {
        String number = String.valueOf(x);
        int[] nums = new int[number.length()];
        int[] reverseNum = new int[nums.length];
        int reverser = number.length()-1;
        for(int i=0; i<number.length(); i++){
            nums[i] =  number.charAt(i);
            reverseNum[i] = number.charAt(reverser);
            reverser--;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] != reverseNum[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.checkPalindrome(9));
        System.out.println(isPalindrome.checkPalindrome(121));
        System.out.println(isPalindrome.checkPalindrome(10));
        System.out.println(isPalindrome.checkPalindrome(1242511));
        System.out.println(isPalindrome.checkPalindrome(-121));
        System.out.println(isPalindrome.checkPalindrome(321123));

    }
}
