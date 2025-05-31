package InterviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
        System.out.println(uniqueOccurrences(new int[]{2, 2}));
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
    private static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> storage = new HashMap<>();
        List<Integer> listForOccurrences = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            storage.put(arr[i], storage.getOrDefault(arr[i], 0)+1);
        }
        for(int value : storage.values()){
            if(listForOccurrences.contains(value)){
                return false;
            }
            listForOccurrences.add(value);
        }
        return true;
    }
}
