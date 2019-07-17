/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
      ListNode newHead=new ListNode(0);
      newHead.next=head;
      ListNode c=newHead;//c作为需要反转链表的头节点
      for(int i=0;i<m-1;i++){
        c=c.next;
      }
      //反转，就是两两交换节点，需要改变三个指针
      ListNode p=c.next;//要交换的第一个节点
      for(int i=0;i<n-m;i++){
       ListNode t= p.next;//交换的第二个节点
        //开始交换p和t同时更新p和t的指针
        p.next=t.next;
        t.next=c.next;
        c.next=t;
      }
      return newHead.next;
    }
}