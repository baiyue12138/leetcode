class MinStack{
//使用两个stack，一个存数，一个存最小的数（栈顶）
	private Stack<Integer>stack;
    private Stack<Integer>minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    public void push(int x) {
       stack.push(x);
       if(minStack.empty()==true||x<=minStack.peek()){
       	minStack.push(x);
       }
    }
    public void pop() {
       
        	int x=stack.pop();
        	if(x==minStack.peek()){
        		minStack.pop();
        	}
        
    }
    public int top() {
    	int x=stack.peek();
    	
        return x;
    }
    public int getMin() {
    	return minStack.peek();
    }
}