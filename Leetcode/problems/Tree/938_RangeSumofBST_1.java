/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        inorder(root,L,R);
        return sum;
    }
    public void inorder(TreeNode root, int L, int R){
    	if(root!=null){
    		inorder(root.left,L,R);
    		if(root.val>=L&&root.val<=R) sum+=root.val;
    		if(root.val>R) return;
    		inorder(root.right,L,R);
    	}
    }
}