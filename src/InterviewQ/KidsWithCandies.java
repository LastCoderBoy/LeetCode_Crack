package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int kidWithMoreCandies = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i:candies){
            kidWithMoreCandies = Math.max(kidWithMoreCandies, i);
        }
        for(int j:candies){
            int totalOfEachKid = j + extraCandies;
            if(totalOfEachKid >= kidWithMoreCandies)
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }
}
