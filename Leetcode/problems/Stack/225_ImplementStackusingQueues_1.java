class MyStack {
	Queue<Integer>stack;
    /** Initialize your data structure here. */
    public MyStack() {
      stack=new LinkedList();  
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        stack.offer(x);
        for(int i=0;i<stack.size()-1;i++){
        	int value=stack.poll();
        	stack.offer(value);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return stack.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return stack.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stack.size()==0;
    }
}