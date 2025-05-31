package InterviewQ;

import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int copy[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            copy[i]=arr[j];
            if(arr[j]==0)
                copy[i++]=0;
            j++;
        }
        System.arraycopy(copy,0,arr,0,n);

//        ****************** DOWN BELOW IS ANOTHER SOLUTION ******************
//        int size = arr.length;
//        int[] tempArray = new int[size];
//        int indexPos = 0;
//        for(int i=0; i< arr.length; i++){
//            if(indexPos == size) break;
//            if(arr[i] == 0){
//                tempArray[indexPos] = 0;
//                if((indexPos + 1) == size) break;
//                else {
//                    tempArray[indexPos + 1] = 0;
//                    indexPos += 2;
//                }
//            }else {
//                tempArray[indexPos] = arr[i];
//                indexPos++;
//            }
//        }
//        for(int i=0; i<size; i++){
//            arr[i] = tempArray[i];
//        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        duplicateZeros(new int[]{0, 0, 0, 0, 0});
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        duplicateZeros(new int[]{1, 0, 2, 3, 1, 0, 4, 5});
        duplicateZeros(new int[]{1, 2, 3});
    }
}
