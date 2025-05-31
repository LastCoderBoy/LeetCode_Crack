package InterviewQ;

public class minOperationsToDivisibleByThree {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,2,3,4}));
    }
    private static int minimumOperations(int[] nums) {
        // [1, 2, 3, 4]
        int total = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] % 3 != 0) {
                total++;
            }
        }
        return total;
    }
}
