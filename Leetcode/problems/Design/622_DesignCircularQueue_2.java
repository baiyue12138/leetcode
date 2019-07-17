class MyCircularQueue {
	int font;//头指针，队非空时指向队头元素，删除
	int rear;//尾指针，队非空时指向队尾元素的下一位置，插入
	int len;//队列的大小
	int[]queue;//队列空间
	int num=0;//队列中元素个数
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        len=k;
        queue=new int[k];
        font=0;
        rear=0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) return false;
        queue[rear%len]=value;
        rear=(rear+1)%len;
        num++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) return false;
        font=(font+1)%len; 
        num--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) return -1;
        return queue[font];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
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