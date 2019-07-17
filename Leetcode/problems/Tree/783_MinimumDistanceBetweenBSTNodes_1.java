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
	int min=Integer.MAX_VALUE;
	TreeNode pre=null;
    public int minDiffInBST(TreeNode root) { 
        if(root==null) return 0;
        inorder(root);
        return min;
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		if(pre!=null){
    			min=Math.min(min,Math.abs(pre.val-root.val));
    		}
    		pre=root;
    		inorder(root.right);
    	}
    }
}