package InterviewQ;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int l = 0, r = nums.length - 1;

        for(int i = nums.length - 1; i>=0; i--){
            if(Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[i] = nums[l] * nums[l];
                l++;
            } else {
                res[i] = nums[r] * nums[r];
                r--;
            }
        }
        return res;

        // DOWN BELOW IS ANOTHER SOLUTION
//        int[] result = powerTheArrayElements(nums);
//        sortTheArray(result, 0, result.length-1);
//
//        return result;
    }

    private static void sortTheArray(int[] array, int left, int right) {
        if(left < right){
            int middle = left + (right - left)/2;
            sortTheArray(array, left, middle); // Left
            sortTheArray(array, middle+1, right); // Right
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {

        int lengOfLeftArray = middle - left + 1;
        int lengOfRightArray = right - middle;

        int[] L = new int[lengOfLeftArray];
        int[] R = new int[lengOfRightArray];

        // Copying the values into the temporary arrays
        for(int i=0; i<lengOfLeftArray; i++){
            L[i] = array[left + i];
        }
        for(int i=0; i<lengOfRightArray; i++){
            R[i] = array[middle + i + 1];
        }

        int i=0, j=0, k=left;
        while(i<lengOfLeftArray && j<lengOfRightArray){
            if(R[j] <= L[i]){
                array[k] = R[j];
                j++;
            }else{
                array[k] = L[i];
                i++;
            }
            k++;
        }
        while(i < lengOfLeftArray){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < lengOfRightArray){
            array[k] = R[j];
            j++;
            k++;
        }
    }

    private static int[] powerTheArrayElements(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        return nums;
    }
}
