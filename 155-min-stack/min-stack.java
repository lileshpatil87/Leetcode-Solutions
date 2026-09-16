class MinStack {

    Deque<Integer> tracker = new ArrayDeque<>();
    Deque<Integer> sc = new ArrayDeque<>();

    public MinStack() {

    }

    public void push(int value) {
        if (!tracker.isEmpty() && tracker.peek() < value) {
            tracker.push(tracker.peek());
        } else {
            tracker.push(value);
        }
        sc.push(value);
    }

    public void pop() {
        sc.pop();
        tracker.pop();
    }

    public int top() {
        return sc.peek();
    }

    public int getMin() {
        return tracker.peek();
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