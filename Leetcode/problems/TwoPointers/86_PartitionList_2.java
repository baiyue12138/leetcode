/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null){
		return null;
	}
      ListNode a=new ListNode(0);
      ListNode b=new ListNode(0);
      ListNode bt=b;
        ListNode at=a;
      while(head!=null){
    	  if(head.val<x){
    		  at.next=head;
              at=head;
    	  }else{
    		  bt.next=head;
              bt=head;
    	  }
    	  head=head.next;
      }
      at.next=b.next;
      bt.next=null;
      return a.next;

    }
}