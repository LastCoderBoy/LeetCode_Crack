package InterviewQ;

public class JumpGameII {
    public static void main(String[] args) {
        System.out.println("test 1: " + jump(new int[]{2, 3, 1, 1, 4} )); // 2
        System.out.println("test 2: " + jump(new int[]{2, 3, 0, 1, 4} )); // 2
        System.out.println("test 3: " + jump(new int[]{0})); // 1
        System.out.println("test 4: " + jump(new int[]{1, 2})); // 1
        System.out.println("test 5: " + jump(new int[]{2, 2})); // 1
        System.out.println("test 6: " + jump(new int[]{2, 0, 0})); // 1
        System.out.println("test 7: " + jump(new int[]{2, 0, 1, 3, 2, 1, 5})); //3
    }

    public static int jump(int[] nums) {
        int numOfJumps = 0;
        int maxReachable = 0;
        int currentEnd = 0;
        for(int i=0; i<nums.length-1; i++){
            maxReachable = Math.max(nums[i] + i, maxReachable);
            if(i== currentEnd) {
                currentEnd = maxReachable;
                numOfJumps++;

                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }
        return numOfJumps;
    }
}
