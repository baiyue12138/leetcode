/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
          if(head==null){
        	return null;
        }
        ListNode newH=new ListNode(head.val-1);
         newH.next=head;
        ListNode pre=newH;
        while(head!=null){
        	if(head.val==val){
        		pre.next=head.next;
        		head=head.next;
        	}else{
        		pre=head;
        		head=head.next;
        	}
        }
        return newH.next;
    }
}