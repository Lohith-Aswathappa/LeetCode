class MyStack {
    Queue<Integer> first;
    Queue<Integer> second;
    /** Initialize your data structure here. */
    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        while(!first.isEmpty()){
            second.add(first.poll());
        }
        
        first.add(x);
        
        while(!second.isEmpty()){
            first.add(second.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return first.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return first.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return second.isEmpty() && first.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */