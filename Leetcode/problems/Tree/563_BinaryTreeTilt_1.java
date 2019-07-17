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
    public int findTilt(TreeNode root) {
        tilt(root);
        return sum;
    }
    public int tilt(TreeNode root){
    	if(root!=null){
    		int l=tilt(root.left);
    		int r=tilt(root.right);
    		sum+=Math.abs(l-r);
    		return root.val+l+r;
    	}else{
    		return 0;
    	}
    }
}