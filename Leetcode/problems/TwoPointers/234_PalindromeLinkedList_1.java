/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   public static boolean isPalindrome(ListNode head) {
		int lhash = 0, rhash = 0;
        for(int x = 1; head != null; head = head.next, x *= 31) {
            lhash = lhash*31 + head.val;            
            rhash = rhash + head.val*x;
        }        
        return lhash == rhash;
    }
	
}