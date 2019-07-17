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
	int value;
	boolean res=true;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        value=root.val;
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		if(root.val!=value) {res=false;return;}
    		inorder(root.right);
    	}
    }

}