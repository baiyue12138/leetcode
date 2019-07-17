/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
	    	 return null;
	     }
	     ListNode newHead=new ListNode(head.val-1);
	     newHead.next=head;
	     ListNode p=newHead;
	     int val=head.val-1;
	     while(head!=null&&head.next!=null){
	    	 if(head.val==head.next.val){
	    		while(head.next!=null&&head.next.val==head.val){
	    			head=head.next;
	    		}
	    		p.next=head.next;
	    	 }else{	
	    		 p=head;	    		 
	    	 }
	    	 head=head.next;
                 }
	     return newHead.next;

    }
}