class MyQueue {
	//使用两个栈
	Stack<Integer>ins;
	Stack<Integer>outs;
    /** Initialize your data structure here. */
    public MyQueue() {
        ins=new Stack();
        outs=new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	ins.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       int pop=0;
       if(outs.size()==0){
       		moveToOuts();
       		pop=outs.pop();
       }else{
       		pop=outs.pop();
       }
       return pop;
    }
    
    /** Get the front element. */
    public int peek() {
        int pop=0;
       if(outs.size()==0){
       		moveToOuts();
       		pop=outs.peek();
       }else{
       		pop=outs.peek();
       }
       return pop;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return ins.empty()&&outs.empty();
    }
    public void moveToOuts(){
    	while(ins.size()>0){
    		outs.push(ins.pop());
    	}
    }
}