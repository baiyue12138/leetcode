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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        preorder(root,0);
        return sum;
    }
    public void preorder(TreeNode root,int pre){
    	if(root!=null){
    		pre=pre*10+root.val;
        if(root.left==null&&root.right==null){
          sum+=pre;
        }
    		preorder(root.left,pre);
    		preorder(root.right,pre);
    	}
    }
}