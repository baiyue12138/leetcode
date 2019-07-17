/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
      if(head==null) return null;
    	Node newHead=new Node(-1);
    	Node p=head;
    	//将新建的节点插入原链表
    	while(p!=null){
    		Node n=new Node(p.val);
    		n.next=p.next;
    		p.next=n;
    		p=n.next;
    	}
    	//更新新链表的random指针
    	p=head;
    	while(p!=null){
    		if(p.random!=null){
    			p.next.random=p.random.next;
    		}
    		p=p.next.next;//注意这里
    	}
    	//将这个链表断成两截
    	p=head;
    	newHead=p.next;
    	while(p!=null){
    	    Node q=p.next;
    		p.next=p.next.next;
    		if(q.next!=null) q.next=q.next.next;//注意这的条件
    		p=p.next;
    	}
        return newHead;
    }
}