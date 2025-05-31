package InterviewQ;

import java.util.Arrays;

public class MinimumTimeToRepairCars {
    private static long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long lowestTime = 0;
        long highesTime = (long) ranks[0] * cars * cars;

        while(lowestTime < highesTime){
            long mediumTime = lowestTime + (highesTime - lowestTime)/2;
            if(canRepairAllCars(mediumTime, ranks, cars)){
              highesTime = mediumTime;
            } else {
                lowestTime = mediumTime + 1;
            }
        }
        return lowestTime;
    }
    private static boolean canRepairAllCars(long highTime, int[] ranks, int cars){
        long totalCars = 0;
        for(int i : ranks){
            totalCars += Math.sqrt(highTime /i);
        }
        return totalCars >= cars;
    }

    public static void main(String[] args) {
        System.out.println(repairCars(new int[]{1,3,4,2}, 10));
    }
}
