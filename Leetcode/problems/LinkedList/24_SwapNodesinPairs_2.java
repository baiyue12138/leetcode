/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
          if(head==null||head.next==null){
	        	return head;
	        }
	        ListNode h,p,q,t;
	        ListNode newH=new ListNode(-1);
	        newH.next=head;
	        h=newH;
	        p=head;
	        q=head.next;
	        while(q!=null){
	        	t=q.next;
	        	h.next=q;
	        	q.next=p;
	        	p.next=t;
	        	h=p;
	        	p=t;
	        		if(t==null){
	        		q=null;
	        	}else{
	        		q=t.next;
	        	}
	        }
	        return newH.next;
    }
}