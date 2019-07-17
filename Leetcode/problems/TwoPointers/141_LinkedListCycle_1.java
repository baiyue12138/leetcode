/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         if(head==null){
			 return false;
		 }
	        ListNode p=head,q=head;
	        while(q!=null&&q.next!=null){
	        	p=p.next;
	        	q=q.next.next;
	        	if(q==p){
	        		return true;
	        	}
	        }
	        return false;
    }
}