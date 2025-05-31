package InterviewQ;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println("test 1: " + canJump(new int[]{2, 3, 1, 1, 4} ));
        System.out.println("test 2: " + canJump(new int[]{3, 2, 1, 0, 4} ));
        System.out.println("test 3: " + canJump(new int[]{0}));
        System.out.println("test 4: " + canJump(new int[]{1, 2}));
        System.out.println("test 4: " + canJump(new int[]{2, 0, 0}));
    }

    public static boolean canJump(int[] nums) {

        int firstPos = 0;
        int lastPosition = nums.length - 1;

        for (int i = nums.length-1; i >=0; i--) {
            if (i + nums[i] >= lastPosition) {
                lastPosition = i;
            }
        }
        return lastPosition == firstPos ? true : false;

    }
}
