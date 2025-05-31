package InterviewQ;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement test = new RemoveElement();
        int result = test.removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(result);
    }
    public int removeElement(int[] nums, int val) {
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
}
