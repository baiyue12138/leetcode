/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
    	// if(head==null||head.next==null) return ;
    	// //设置双指针，使用两个循环来查找这两位置
    	// ListNode cur=head;
    	// while(cur!=null){
    	// ListNode tem=cur;//最后一个节点
    	// ListNode last=cur;
    	// while(tem.next!=null){
    	// last=tem;//tem之前的节点
    	// tem=tem.next;
    	// }
    	// last.next=null;
    	// tem.next=cur.next;
    	// cur.next=tem;
    	// cur=cur.next.next;
    	// }
    	//第一步设置快慢指针找到链表的中间位置
    	//第二步将后半截倒序
    	//将这两段交叉排列
    	if(head==null||head.next==null||head.next.next==null) return;
    	ListNode fast=head;
    	ListNode slow=head;
    	while(fast.next!=null&&fast.next.next!=null){
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	ListNode second=slow.next;
    	slow.next=null;
    	second=reverseList(second);//反转后的后半截列表
    	ListNode first=head;
    	while(second!=null){
    		ListNode tem=second.next;
    		second.next=first.next;
    		first.next=second;
    		second=tem;
    		first=first.next.next;
    	}
      return;
    }
  // 就地翻转链表
private ListNode reverseList(ListNode head) {
	ListNode prev = null;
	ListNode next = null;
	while (head != null) {
		next = head.next;
		head.next = prev;
		prev = head;
		head = next;
	}
	return prev;
}
    // ListNode reverseList(ListNode head){
    // 	if(head==null||head.next==null) return head;
    // 	ListNode newhead=new ListNode(0);
    // 	newhead.next=head;
    // 	ListNode cur=head.next;
    // 	while(cur!=null){
    // 		head.next=cur.next;
    // 		cur.next=head;
    // 		newhead.next=cur;
    // 		cur=head.next;
    // 	}
    // 	return newhead.next;
    // }
}