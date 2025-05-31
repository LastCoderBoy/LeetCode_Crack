package InterviewQ;

import java.util.Arrays;

public class TwoSneakyNumbersOfDigitville {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2})));
    }

    private static int[] getSneakyNumbers(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        int[] result = new int[2];
        int index = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                result[index++] = nums[i];
            }
        }
        return result;
    }
    private static void quickSort(int[] array, int low, int high){
        if(low< high){
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }
    private static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j=low; j<high; j++){
            if(array[j] <= pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }
}
