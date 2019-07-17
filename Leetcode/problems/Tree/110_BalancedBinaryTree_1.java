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
    public int maxdepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxdepth(root.left);
        int right=maxdepth(root.right);
        if(left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(maxdepth(root)==-1){
            return false;
        }
        return true;
        
    }
}