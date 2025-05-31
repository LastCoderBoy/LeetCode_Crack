package InterviewQ;

import java.util.HashMap;
import java.util.Map;

public class FinalValueAfterPerformingOperations {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }
    private static int finalValueAfterOperations(String[] operations) {
//        HashMap<String, Integer> staticOperations = new HashMap<>(
//                Map.of("++X",1, "X++", 1, "--X", -1, "X--", -1)
//        );
        int variable = 0;
        for(String op : operations){
            if(op.charAt(1) == '+'){
                variable += 1;
            }
            else {
                variable -= 1;
            }
        }
        return variable;
    }
}
