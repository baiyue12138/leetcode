/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   public  ListNode deleteDuplicates(ListNode head) {
       if(head==null){
	    	 return null;
	     }
	     
	     ListNode tem=head;
	     while(tem.next!=null){
	    	 if(tem.val==tem.next.val){
	    		 tem.next=tem.next.next;
	    	 }else{	 
	    		 tem=tem.next;
	    	 }
	     }
	     return head;

    }
}