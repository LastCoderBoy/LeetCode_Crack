package InterviewQ;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        System.out.println("test 1: " + hIndex(new int[]{3, 0, 6, 1, 5} ));
    }
    public static int hIndex (int[] citations){
        Arrays.sort(citations);
        int h = 0;
        for (int i=0; i<citations.length; i++){
            h = citations.length-i;
            if(citations[i]>= h){
                return h;
            }
        }
        return 0;
    }
}
