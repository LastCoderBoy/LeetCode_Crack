package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingObservations {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        List<List<Integer>> combinations = new ArrayList<>();
        int totalSum = (m + n) * mean;
        int sumOfRolls = 0;

        // Calculate the sum of the given rollsq
        for (int roll : rolls) {
            sumOfRolls += roll;
        }

        // Calculate the sum that the n missing rolls need to contribute
        int missingSum = totalSum - sumOfRolls;

        // If the missing sum is impossible to distribute across n rolls between 1 and 6
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0]; // Return empty array if impossible
        }

        // Generate valid combinations
        findCombinations(new ArrayList<>(), combinations, 0, n, missingSum);

        // If there are no valid combinations, return an empty array
        if (combinations.isEmpty()) {
            return new int[0];
        }

        // Convert the first valid combination to an array
        List<Integer> firstCombination = combinations.get(0);
        int[] result = firstCombination.stream().mapToInt(i -> i).toArray();

        return result;
    }

    // Recursive function to find all valid combinations of n numbers that sum up to targetSum
    private void findCombinations(List<Integer> currentCombination, List<List<Integer>> combinations, int sum, int n, int targetSum) {
        if (currentCombination.size() == n) {
            if (sum == targetSum) {
                combinations.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        for (int i = 1; i <= 6; i++) {
            currentCombination.add(i);
            findCombinations(currentCombination, combinations, sum + i, n, targetSum);
            currentCombination.remove(currentCombination.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        FindMissingObservations obj = new FindMissingObservations();
        int[] result = obj.missingRolls(new int[]{1, 5, 6}, 3, 4);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
