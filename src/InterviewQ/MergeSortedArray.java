package InterviewQ;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArray = new int[m+n];
        int pos = 0, i=0, j=0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                tempArray[pos] = nums1[i];
                i++;
            }else{
                tempArray[pos] = nums2[j];
                j++;
            }
            pos++;
        }
        while(j<n){
            tempArray[pos] = nums2[j];
            j++;
            pos++;
        }
        while(i<m){
            tempArray[pos] = nums1[i];
            i++;
            pos++;
        }

        System.arraycopy(tempArray,0,nums1,0,tempArray.length);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{1}, 1, new int[]{}, 0);
        merge(new int[]{}, 0, new int[]{}, 0);
    }
}
