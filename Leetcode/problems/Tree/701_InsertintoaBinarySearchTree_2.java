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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node=root;
        TreeNode pre=root;
        while(node!=null){
        	if(node.val>val){
        		pre=node;
        		node=node.left;
        	}else{
        		pre=node;
        		node=node.right;
        	}
        }
        TreeNode t=new TreeNode(val);
        if(pre.val>val){
        	pre.left=t;
        }else{
        	pre.right=t;
        }
        return root;
    }
}