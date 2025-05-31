package InterviewQ;

public class SearchInsertPosition {
    public static void main(String[] args) {
//        System.out.println(searchInsert(new int[]{1,3,5,6,8,9}, 6));
        System.out.println(searchInsert(new int[]{1,3,5,6,8,9}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6,8,9}, 4));
        System.out.println(searchInsert(new int[]{1,3,5,6,8,9}, 10));
    }
    public static int searchInsert(int[] nums, int target) {
        int indexPos = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target || nums[i] > target){
                return i;
            }
            else {
                indexPos = i+1;
            }
        }
        return indexPos;
    }
}
