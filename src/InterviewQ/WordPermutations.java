package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class WordPermutations {

    static void createPermutations(String[] array, int currentIndex) {
        // Base case: If we've fixed all positions, add a copy of the current permutation
        if (currentIndex == array.length) {
            for (String element : array) {
                System.out.print(element + "");
            }
            System.out.println("");
            return ;
        }
        // Recursive case: Swap each element with the current index to explore all possibilities
        for (int i = currentIndex; i < array.length; i++) {
            swapElements(array, currentIndex, i);   // Fix an element at currentIndex
            createPermutations(array, currentIndex + 1);  // Recurse for the next index
            swapElements(array, currentIndex, i);   // Undo the swap to backtrack
        }
    }

    static void swapElements(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        String[] inputArray = {"foo", "bar", "the"};
        createPermutations(inputArray, 0);
    }
}

