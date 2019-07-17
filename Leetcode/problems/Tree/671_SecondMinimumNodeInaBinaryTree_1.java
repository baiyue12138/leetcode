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
     public int findSecondMinimumValue(TreeNode root) {
        if(root==null)return -1;
        return dfs(root,root.val);
    }
    public int dfs(TreeNode root,int num){
    	if(root==null) return -1;
    	if(root.val>num) return root.val;
    	int left=dfs(root.left,num);
    	int right=dfs(root.right,num);
    	if(left!=-1&&right!=-1)
    		return Math.min(left,right);
    	else{
    		return Math.max(left,right);
    	}
    }
}