package InterviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    private HashMap<Integer, Integer> set;
    private ArrayList<Integer> array;

    public RandomizedSet() {
        set = new HashMap<>();
        array = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(!array.contains(val)){
            array.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(array.contains(val)){
            array.remove((Integer) val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Random random = new Random();
        final int index = random.nextInt(array.size());
        return array.get(index);
    }
}

class Main{
    public static void main(String[] args) {
        RandomizedSet test1 = new RandomizedSet();
        boolean bool1 = test1.insert(5);
        boolean bool2 = test1.insert(5);
        boolean bool3 = test1.insert(1);
        boolean bool4 = test1.remove(5);
        int random = test1.getRandom();

        System.out.println(bool1 + " " + bool2 + " " + bool3 + " " + bool4 + " " + random);
    }
}
