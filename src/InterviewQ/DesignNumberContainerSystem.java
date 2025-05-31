package InterviewQ;

import java.util.*;

public class DesignNumberContainerSystem {
    private HashMap<Integer, Integer> map; // index -> number
    private TreeMap<Integer, TreeSet<Integer>> numToIndexes; // number -> sorted indices

    public DesignNumberContainerSystem() {
        map = new HashMap<>();
        numToIndexes = new TreeMap<>();
    }

    public void change(int index, int number) {
        if(map.containsKey(index)){
            Integer oldNumber = map.get(index);
            if(oldNumber == number) return;

            numToIndexes.get(oldNumber).remove(index);
            if (numToIndexes.get(oldNumber).isEmpty()) {
                numToIndexes.remove(oldNumber);
            }
        }
        map.put(index, number);
        numToIndexes.putIfAbsent(number, new TreeSet<>());
        numToIndexes.get(number).add(index);
    }

    public int find(int number) {
        if(numToIndexes.get(number).isEmpty() || !numToIndexes.containsKey(number)) return -1;
        return numToIndexes.get(number).first();
    }
}