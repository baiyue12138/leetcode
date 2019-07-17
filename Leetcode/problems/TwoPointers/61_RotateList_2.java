/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }每链表长度一个循环
 */

class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
		if (head == null || k <= 0) {
			return head;
		}
		ListNode current = head;
		int n = 1;
		//O(n)
		while (current.next != null) {
			n++;
			current = current.next;
		}

		current.next = head;

		int count = n - k % n;
		ListNode result = null;
		for (int i = 0; i < count; i++) {
			current = current.next;
		}
		result = current.next;
		current.next = null;
		return result;
	}
}