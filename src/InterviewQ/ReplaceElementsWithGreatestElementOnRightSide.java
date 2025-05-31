package InterviewQ;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {


        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        int i = arr.length - 2, max = arr[arr.length-1];
        int temp = 0;
        while(i >= 0) {
            temp = arr[i];
            arr[i] = max;
            if(temp > max) {
                max = temp;
            }
            i--;
        }
        arr[arr.length-1] = -1;
        return arr;
//        for(int i=0; i<arr.length; i++){
//            if(i== arr.length-1){
//                arr[i] = -1;
//            }else {
//                int max = 0;
//                for (int j = i + 1; j < arr.length; j++) {
//                    max = Math.max(max, arr[j]);
//                }
//                arr[i] = max;
//            }
//        }
//        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
        System.out.println(Arrays.toString(replaceElements(new int[]{17})));
    }
}
