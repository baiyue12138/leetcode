/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[]list=new ListNode[k];
        int count=0;
        ListNode cur=root;
        while(cur!=null){
        	count++;
        	cur=cur.next;
        }
        int rem=count%k;
        count=count/k;
        cur=root;
        for(int i=0;i<k;i++){

        	if(cur!=null){
        		ListNode head=new ListNode(-1);
        		ListNode pre=head;
        		for(int j=0;j<count+(rem>0?1:0);j++){
        			pre.next=cur;
        			pre=pre.next;
        			cur=cur.next;
        	}
            pre.next=null;
        	list[i]=head.next;
        	rem--;
        	}else{
        		list[i]=null;
        	}
        	
        }
    return list;
    }
}