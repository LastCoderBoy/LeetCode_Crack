package InterviewQ;

public class GasStation {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[] {1,2,3,4,5}, new int[]{3,4,5,1,2}));
        System.out.println(canCompleteCircuit(new int[] {1,2,3,4,5,4,1,1,1}, new int[]{3,4,5,1,2,1,2,10,8}));
        System.out.println(canCompleteCircuit(new int[] {2,3,4}, new int[]{3,4,3}));
        System.out.println(canCompleteCircuit(new int[] {1,2,3,4,5,6,7,8}, new int[]{1,2,3,4,5,6,7,8}));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
       int startingPosition = 0, tank = 0, totalFuel=0;
       for(int i=0; i<gas.length; i++) {
           tank += gas[i] - cost[i];
           if (tank < 0) {
               totalFuel += tank;
               startingPosition = i+1;
               tank=0;
           }
       }
       totalFuel +=tank;
       return totalFuel>=0?startingPosition:-1;
    }
}
