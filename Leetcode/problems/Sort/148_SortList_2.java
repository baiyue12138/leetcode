/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  //使用归并排序的方法，但是需要寻找中间位置的元素，所以需要使用快慢指针将链表截为两部分
    public ListNode sortList(ListNode head) {
      if(head==null||head.next==null){
        return head;
      }
      //定义快慢指针
      ListNode fast=head;
      ListNode slow=head;
      while(fast.next!=null){
        fast=fast.next.next;//走两步
        if(fast==null)
          break;
        slow=slow.next;
      }
      ListNode right=slow.next;
      slow.next=null;//将链表截断
      ListNode left=sortList(head);
      right=sortList(right);
      return mergeList(left,right);
        
    }
  ListNode mergeList(ListNode l1,ListNode l2){
    if(l1==null) return l2;
    if(l2==null) return l1;
    ListNode head=new ListNode(0);
    ListNode cur=head;
    while(l1!=null&&l2!=null){
      if(l1.val>=l2.val){
        cur.next=l2;
        l2=l2.next;
      }else{
        cur.next=l1;
        l1=l1.next;
      }
      cur=cur.next;
    }
    if(l1!=null) cur.next=l1;
    if(l2!=null) cur.next=l2;
    return head.next;
  }
  
}