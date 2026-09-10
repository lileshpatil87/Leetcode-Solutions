class MinStack {
    int minVal = Integer.MAX_VALUE;
    Deque<Integer> tr = new ArrayDeque<>();
    Deque<Integer> sc = new ArrayDeque<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        tr.push(minVal);
        if(value < minVal){
            minVal = value;
        }
        sc.push(value);
    }
    
    public void pop() {
        sc.pop();
        minVal = tr.pop();
    }
    
    public int top() {
        return sc.peek();
    }
    
    public int getMin() {
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */