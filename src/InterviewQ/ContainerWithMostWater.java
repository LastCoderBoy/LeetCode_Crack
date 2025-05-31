package InterviewQ;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int currentHeight =0;
        int waterContainer =0;
        int maxWater = 0;
        int right = height.length-1, left=0;

        while (left<right){
            currentHeight = Math.min(height[left], height[right]);
            waterContainer = currentHeight * (right-left);

            maxWater = Math.max(maxWater, waterContainer);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ContainerWithMostWater water = new ContainerWithMostWater();
        System.out.println(water.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
