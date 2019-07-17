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
    public TreeNode invertTree(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)) return root;
        TreeNode tem=root.right;
        root.right=root.left;
        root.left=tem;
        if(root.left!=null) invertTree(root.left);
        if(root.right!=null) invertTree(root.right);//如果右子树不空，则反转右子树
        return root;
    }
}