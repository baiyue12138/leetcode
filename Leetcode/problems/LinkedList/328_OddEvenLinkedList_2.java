/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
       if(head==null){
			return null;
		}
        ListNode sh=head,fh=head.next;
        ListNode f=fh;
        while(f!=null&&f.next!=null){
        	sh.next=f.next;
        	sh=sh.next;
        	f.next=f.next.next;
        	f=f.next;
        }
        sh.next=fh;
        return head; 
    }
}