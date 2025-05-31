package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyCalendar {
    ArrayList<int[]> schedules;
    public MyCalendar() {
        schedules = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for(int [] intervals : schedules){
            if(intervals[0] < end && intervals[1]>start){
                return false;
            }
        }
        schedules.add(new int[]{start, end});
        return true;
    }

    public static void main(String[] args) {
        MyCalendar obj = new MyCalendar();
        System.out.println(obj.book(10,20));
        System.out.println(obj.book(20,30));
        System.out.println(obj.book(15,30));
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
