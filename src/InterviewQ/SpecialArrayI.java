package InterviewQ;

public class SpecialArrayI {
    public static boolean isArraySpecial(int[] nums) {
        for(int i=1; i<nums.length; i++){
            int isOdd = (nums[i] % 2 == 1) ? 1 : 0;
            int isEven = (nums[i-1] % 2 == 0) ? 0 : 1;
            if( isEven == isOdd ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isArraySpecial(new int[]{4, 3, 2, 1, 5, 6}));
        System.out.println(isArraySpecial(new int[]{4, 3, 2, 1}));
        System.out.println(isArraySpecial(new int[]{4, 3, 1, 6}));
        System.out.println(isArraySpecial(new int[]{4}));
    }
}
