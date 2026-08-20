class MinStack {
    Deque<Integer> mainstack ;
    Deque<Integer> minstack ;
    public MinStack() {
        mainstack = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        if(minstack.isEmpty()||minstack.peek()>=value){
            minstack.push(value);
        }
           mainstack.push(value);

    }
    
    public void pop() {
        if(mainstack.peek().equals(minstack.peek())){
            minstack.pop();
        }
            mainstack.pop();
}
    
    public int top() {
        return mainstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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