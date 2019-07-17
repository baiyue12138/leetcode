/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        Node cur=head;
      	while(cur!=null){
        	if(cur.child!=null){//将子链表插入
        		Node h1=cur.child;//得到子列表的头节点
        		Node hcur=cur.child;
        		while(hcur!=null&&hcur.next!=null){//找到尾部节点hcur
        			hcur=hcur.next;
        		}
        		//插入链表
        		hcur.next=cur.next;//处理尾部节点
        		if(cur.next!=null) cur.next.prev=hcur;
        		//处理头部节点
        		cur.next=h1;
        		h1.prev=cur;
        		cur.child=null;//这句不能忽略
        	}
        	cur=cur.next;
      }
      return head;
    }
}