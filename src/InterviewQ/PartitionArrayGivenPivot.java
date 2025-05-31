package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PartitionArrayGivenPivot {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)));
        System.out.println(Arrays.toString(pivotArray(new int[]{-3,4,3,2}, 2)));
    }
//    private static int[] pivotArray(int[] nums, int pivot) {
//        LinkedList<Integer> beforePivot = new LinkedList<>();
//        LinkedList<Integer> afterPivot = new LinkedList<>();
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] < pivot){
//                beforePivot.add(nums[i]);
//            }
//            else if(nums[i] == pivot){
//                afterPivot.add(0, pivot);
//            }
//            else {
//                afterPivot.add(nums[i]);
//            }
//        }
//
//        for(int i=0; i<beforePivot.size(); i++){
//            nums[i] = beforePivot.get(i);
//        }
//
//        int inc = beforePivot.size();
//
//        for(int i=0; i<afterPivot.size(); i++){
//            if(inc < nums.length) {
//                nums[inc] = afterPivot.get(i);
//                inc++;
//            }
//        }
//
//        return nums;
//    }

    private static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> beforePivot = new ArrayList<>();
        List<Integer> equalPivot = new ArrayList<>();
        List<Integer> afterPivot = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                beforePivot.add(num);
            } else if (num == pivot) {
                equalPivot.add(num);
            } else {
                afterPivot.add(num);
            }
        }

        int[] result = new int[nums.length];
        int index = 0;

        for (int num : beforePivot) {
            result[index++] = num;
        }

        for (int num : equalPivot) {
            result[index++] = num;
        }

        for (int num : afterPivot) {
            result[index++] = num;
        }

        return result;
    }


    private static void mergeSort(int[] array, int left, int right){
        if (left < right){
            int middle = left + (right - left)/2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }
    private static void merge(int[] array, int left, int middle, int right){
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;
        int[] L = new int[leftArraySize];
        int[] R = new int[rightArraySize];
        for(int i=0; i<leftArraySize; i++){
            L[i] = array[left + i];
        }
        for(int i=0; i<rightArraySize; i++){
            R[i] = array[middle + 1 + i];
        }

        int i=0, j=0, k=left;

        while(i < leftArraySize && j < rightArraySize){
            if(R[j] <= L[i]){
                array[k] = R[j];
                j++;
            }
            else {
                array[k] = L[i];
                i++;
            }
            k++;
        }

        while(i<leftArraySize){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j<rightArraySize){
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
