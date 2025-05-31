import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(duplicateArrays(new int[]{1, 2, 3, 4})));
        System.out.println('1' - '0');
        System.out.println('5' - '0');
    }
    private static int removeElement(int[] nums, int val) {
        int[] tempArray = new int[nums.length];
        int pos = 0;
        for(int number : nums){
            if(number == val) continue;
            else{
                tempArray[pos] = number;
            }
            pos++;
        }
        System.arraycopy(tempArray, 0, nums, 0, pos);
        return pos;
    }

    private static int[] duplicateArrays(int[] nums){
        int[] ans = new int[2  * nums.length];

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}
