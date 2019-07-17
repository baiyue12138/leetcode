class ListNode{
	public int val;
	public ListNode next;
	public ListNode(int val){
		this.val=val;
	}
}
class MyLinkedList {
    /** Initialize your data structure here. */
    ListNode head;//头节点
    public MyLinkedList() {
        this.head=new ListNode(0);
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0) return -1;
        int i=-1;
        ListNode cur=head.next;
        while(cur!=null){
        	i++;
        	if(i==index) return cur.val;
        	cur=cur.next;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	ListNode p=new ListNode(val);
    	p.next=this.head.next;
    	this.head.next=p;
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode p=new ListNode(val);
        ListNode cur=this.head.next;
        while(cur!=null){
        	if(cur.next==null) break;
        	cur=cur.next;
        }
        cur.next=p;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index<0) return;
        ListNode p=new ListNode(val);
        ListNode cur=this.head.next;
        if(index==0) {
        	p.next=cur;
        	this.head.next=p;
        	return;
        }
        int i=0;
        while(cur!=null){
        	if(i==index-1){
        		p.next=cur.next;
        		cur.next=p;
        		break;
        	}else{
        		if(cur.next==null){
        			cur.next=p;
        			break;
        		}
        		i++;
        		cur=cur.next;
        	}
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
   public void deleteAtIndex(int index) {
        ListNode cur = this.head;
        int num = -1;
        while(cur.next != null) {
            num ++;
            if(num == index ) {
                ListNode temp = cur.next;
                cur.next = temp.next;
                break;
            }
            cur = cur.next;
        }
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */