package InterviewQ;

public class ValidMountainArray {
    private static boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int peakPos = 0;
        for(int i=1; i< arr.length; i++){
            if(arr[i] > arr[i-1]) continue;
            else if(arr[i] == arr[i-1]) return false;
            peakPos = i-1;
            break;
        }
        if(peakPos > 0) {
            int[] rightArray = new int[arr.length - peakPos - 1];
            System.arraycopy(arr, peakPos + 1, rightArray, 0, rightArray.length);
            return IsSortedInDesc(rightArray);
        }else {
            return false;
        }
    }

    private static boolean IsSortedInDesc(int[] rightArray) {
        boolean condition = true;
        for(int i=0; i<rightArray.length-1; i++){
            if(rightArray[i] <= rightArray[i+1]){
                condition = false;
                break;
            }
        }
        return condition;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3}));
        System.out.println(validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0}));
        System.out.println(validMountainArray(new int[]{0, 2, 3, 4, 5, 3, 2, 1}));
        System.out.println(validMountainArray(new int[]{0, 2, 3, 3, 5, 3, 2, 1}));
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
        System.out.println(validMountainArray(new int[]{0, 5, 5}));
        System.out.println(validMountainArray(new int[]{0, 5}));
    }
}
