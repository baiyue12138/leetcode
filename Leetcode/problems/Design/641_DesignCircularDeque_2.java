class MyCircularDeque {
	int font;//头指针，队非空时指向队头元素，删除
	int rear;//尾指针，队非空时指向队尾元素，插入
	int len;//队列的大小
	int[]queue;//队列空间
	int num=0;//队列中元素个数
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        len=k;
        queue=new int[k];
        font=0;
        rear=0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()) return false;
        font=(font-1+len)%len;
        queue[font]=value;
        num++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()) return false;
        rear=(rear)%len;
        queue[rear]=value;
        rear=(rear+1)%len;
        num++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()) return false;
        num--;
        font=(font+1)%len;
      return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()) return false;
        num--;
        rear=(rear-1+len)%len;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()) return -1;
        return queue[font];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty()) return -1;
        return queue[(rear-1+len)%len];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return num==0?true:false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
       return num==len?true:false; 
    }
}