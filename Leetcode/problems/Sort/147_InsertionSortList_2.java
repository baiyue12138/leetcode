/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
      ListNode newHead=head;
        while(head!=null){
          int tem=head.val;
          ListNode j=head.next;
          ListNode pos=head;
          while(j!=null){
            if(j.val<tem){
              tem=j.val;
              pos=j;
            }
            j=j.next;
          }
          pos.val=head.val;
          head.val=tem;
          head=head.next;
        }
      return newHead;
    }
}