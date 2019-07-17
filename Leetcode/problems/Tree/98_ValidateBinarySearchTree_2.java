/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
   boolean firstCompare = true; 
	  int prev = 0;
	  public boolean isValidBST(TreeNode root) {
	        if(root == null)
	            return true;
	        return isValidBST(root.left) && compare(root.val) && isValidBST(root.right);
	    }
	    
	    public boolean compare(int val){
	        if(firstCompare){
	            firstCompare = false;
	            prev = val;
	            return true;
	        }
	        if(val <= prev) return false;
	        prev = val;
	        return true;
	    }
}