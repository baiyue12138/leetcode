/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode pointer=head;
        int sum=0;
        while(l1!=null||l2!=null){//长度不相等
        	sum/=10;
        	if(l1!=null){
        		sum+=l1.val;
        		l1=l1.next;
        	}
        	if(l2!=null){
        		sum+=l2.val;
        		l2=l2.next;
        	}
        	
        	pointer.next=new ListNode(sum%10);
        	pointer=pointer.next;
        	
        }
        if(sum/10==1){//最高位有进位
        	
        	pointer.next=new ListNode(1);
        }
        return head.next;
    }
}