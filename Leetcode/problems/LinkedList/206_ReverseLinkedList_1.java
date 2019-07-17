/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   ListNode reverseList(ListNode head){
    	if(head==null||head.next==null) return head;
    	ListNode cur=null;
    	ListNode tem=null;
    	cur=head.next;
    	head.next=null;
    	while(cur!=null){
    		tem=cur.next;
    		cur.next=head;
    		head=cur;
    		cur=tem;
    	}
    	return head;
    }
}