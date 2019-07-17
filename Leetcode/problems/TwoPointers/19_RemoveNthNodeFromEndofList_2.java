/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(n<=0||head==null){
        	return null;
        }
        ListNode p=head;
        ListNode q=head;
        ListNode m=head;
        for(int i=0;i<n-1;i++){
        	if(p.next!=null){
        		p=p.next;
        	}else{
        		return null;
        	}
        }
        while(p.next!=null){       
        		p=p.next;
        		m=q;
        		q=q.next;       	
        }
        if(q==head){
        	head=head.next;
        }else{
        	m.next=q.next;
        }
        return head;
    }
}