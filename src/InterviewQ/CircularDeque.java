package InterviewQ;

import java.util.ArrayList;

class CircularDeque {

    ArrayList<Integer> deQue;
    int size = 0;
    public CircularDeque(int k) {
        deQue = new ArrayList<>(k);
        size = k;
    }

    public boolean insertFront(int value) {
        if(deQue.size()<size) {
            deQue.add(0, value);
            return true;
        }
        return false;
    }

    public boolean insertLast(int value) {
        if(deQue.size()<size){
            deQue.add(deQue.size(),value);
            return true;
        }
        return false;
    }

    public boolean deleteFront() {
        if(!deQue.isEmpty()){
            deQue.remove(0);
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if(!deQue.isEmpty()){
            deQue.remove(deQue.size()-1);
            return true;
        }
        return false;
    }

    public int getFront() {
        if(!deQue.isEmpty()){
            return deQue.get(0);
        }
        return -1;

    }

    public int getRear() {
        if(!deQue.isEmpty()){
            return deQue.get(deQue.size()-1);
        }
        return -1;
    }

    public boolean isEmpty() {
        if(deQue.isEmpty()) return true;
        return false;
    }

    public boolean isFull() {
        return deQue.size() == size;
    }

    public static void main(String[] args) {
        CircularDeque myCircularDeque = new CircularDeque(8);
        System.out.println(myCircularDeque.insertFront(5));
        System.out.println(myCircularDeque.getFront());
        System.out.println(myCircularDeque.isEmpty());
        System.out.println(myCircularDeque.deleteFront());
        System.out.println(myCircularDeque.insertLast(3));
        System.out.println(myCircularDeque.getRear());
        System.out.println(myCircularDeque.insertLast(7));
        System.out.println(myCircularDeque.insertFront(7));
        System.out.println(myCircularDeque.deleteLast());
        System.out.println(myCircularDeque.insertLast(4));
        System.out.println(myCircularDeque.isEmpty());

        //["MyCircularDeque","insertFront","getFront","isEmpty","deleteFront","insertLast","getRear","insertLast","insertFront","deleteLast","insertLast","isEmpty"]
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
