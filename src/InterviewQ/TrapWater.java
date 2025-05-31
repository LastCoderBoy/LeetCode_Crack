package InterviewQ;

import java.util.Arrays;

public class TrapWater {
    public static void main(String[] args) {
        System.out.println("Test 1: " + trap(new int[]{1,0,2}));
        System.out.println("Test 2: " + trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int trap(int[] height) {
        int water=0;
        int maxLeft =0, maxRight=0;
        int j = height.length-1, i=0;
        while (i<j){
            if(height[i] <= height[j]){
                maxLeft = Math.min(maxLeft, height[i]);
                water += maxLeft - height[i];
                i++;
            }
            else {
                maxRight = Math.min(height[j], maxRight);
                water += maxRight - height[j];
                j--;
            }
        }
        return water;
    }
}
