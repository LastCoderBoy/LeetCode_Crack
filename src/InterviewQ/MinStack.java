package InterviewQ;

import java.util.Stack;

class MinStack {
    public Stack<Integer> myStack;
    int minElement;
    public MinStack() {
        myStack = new Stack<>();
        minElement = Integer.MAX_VALUE;
    }

    public void push(int val) {
        myStack.push(val);
        //minElement = Math.min(minElement, val);
    }

    public void pop() {
        myStack.pop();
    }

    public int top() {
        return myStack.peek();
    }

    public int getMin() {
        if(!myStack.isEmpty()) {
            minElement = Integer.MAX_VALUE;
            for (int num :myStack){
                minElement = Math.min(minElement, num);
            }
        }
        return minElement;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
