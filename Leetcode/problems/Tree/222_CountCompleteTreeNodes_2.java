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
    public int countNodes(TreeNode root) {
       inorder(root);
       return sum; 
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		sum++;
    		inorder(root.right);
    	}
    }
}