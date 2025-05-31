package InterviewQ;

import java.util.Arrays;

public class TransformArrayByParity {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(transformArray(new int[]{4, 3, 2, 1})));
    }

    private static int[] transformArray(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else {
                nums[i] = 1;
            }
        }

        //Sorting (using QuickSort)
        quickSort(nums, 0, nums.length-1);

        return nums;
    }

    private static void quickSort(int[] array, int low, int high){
        if(low < high){
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
                int temp1 = array[i];
                array[i] = array[j];
                array[j] = temp1;
            }
        }
        int temp2 = array[i+1];
        array[i+1] = pivot;
        array[high] = temp2;

        return i+1;
    }
}
