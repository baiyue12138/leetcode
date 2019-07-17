/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  //使用归并排序
    public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		return MSort(lists, 0, lists.length - 1);
	}
 
	public ListNode MSort(ListNode[] lists, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			ListNode leftlist = MSort(lists, low, mid);
			ListNode rightlist = MSort(lists, mid + 1, high);
			return mergeTwoLists(leftlist, rightlist);
		}
		// 如果相等，只有一个元素，返回即可
		return lists[low];
	}
 
	// 递归合并链表
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode res = null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val <= l2.val) {
			res = l1;
			l1.next = mergeTwoLists(l1.next, l2);
		} else {
			res = l2;
			l2.next = mergeTwoLists(l1, l2.next);
		}
		return res;
	}

}