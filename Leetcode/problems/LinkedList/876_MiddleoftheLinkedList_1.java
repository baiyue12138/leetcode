/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
      //使用快慢指针
      ListNode fast=head;
      ListNode slow=head;
      while(fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==null){
          break;
        }
        
      }
      return slow;
        
    }
}