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
	        List<Integer> list1=new ArrayList<Integer>();
	        List<Integer> list2=new ArrayList<Integer>();
	        while(l1!=null){
	        	list1.add(l1.val);
	        	l1=l1.next;
	        }
	        while(l2!=null){
	        	list2.add(l2.val);
	        	l2=l2.next;
	        }
	        ListNode head=new ListNode(0);
	        head.next=null;
	        int sum=0;
	        int other=0;//进位
	        while(list1.size()>0||list2.size()>0){
                sum=0;
	        	if(list1.size()>0){
	        		sum+=list1.get(list1.size()-1);
	        		list1.remove(list1.size()-1);
	        	}
	        	if(list2.size()>0){
	        		sum+=list2.get(list2.size()-1);
	        		list2.remove(list2.size()-1);
	        	}
	        		sum+=other;
	        	 	other=sum/10;
	        		sum=sum%10;	
	        		ListNode node=new ListNode(sum);
	        		ListNode p=head.next;
	        		head.next=node;
	        		node.next=p;
	        }
	        head.val=other;
	        if(head.val==0){
	        	return head.next;
	        }
	        return head;
	    }
}