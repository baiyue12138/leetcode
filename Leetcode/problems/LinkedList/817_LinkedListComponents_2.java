/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	boolean find(int[]G,int t){
		for(int i=0;i<G.length;i++){
			if(G[i]==t){
			return true;
			}
		}
		return false;
	}
    public int numComponents(ListNode head, int[] G) {
    	int count=0;//统计组件的数量
    	ListNode cur=head;
    	boolean f=false;//用于标记
    	while(cur!=null){
    		if(find(G,cur.val)){
    			f=true;		
    		}else{
    			if(f){
    				count++;
    				f=false;
    			}
    		}
    	cur=cur.next;
    	}
        if(f) count++;//防止到最后仍然是相同这种情况
        return count;
    }
}