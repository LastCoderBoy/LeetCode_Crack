package InterviewQ;

public class IncreasingTripleSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int i=0; i < nums.length; i++){
            if(first >= nums[i]){
                first = nums[i];
            }
            else if(second >= nums[i]){
                second = nums[i];
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(increasingTriplet(new int[]{0,4,2,1,0,-1,-3}));
//        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
        System.out.println(increasingTriplet(new int[]{2,1,5}));
        System.out.println(increasingTriplet(new int[]{2,1}));
    }
}
