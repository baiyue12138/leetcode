/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          ListNode resu=new ListNode(0);
	        ListNode tem=resu;
	        if(l1==null){
	        	return l2;
	        }
	        if(l2==null){
	        	return l1;
	        }
	        while(l1!=null&&l2!=null){
	        		if(l1.val<=l2.val){
	        			tem.next=new ListNode(l1.val);
	        			tem=tem.next;
	        			l1=l1.next;
	        		}else{
	        			tem.next=new ListNode(l2.val);
	        			tem=tem.next;
	        			l2=l2.next;
	        		}
	         }
	        if(l1!=null&&l2==null){
        		tem.next=l1;
        	}else{
        		if(l2!=null&&l1==null){
        			tem.next=l2;
        		}
        	}

	        return resu.next;

    }
}