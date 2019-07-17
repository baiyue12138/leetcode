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
    //后序遍历递归
    //先把左子树放到右节点上，然后把原先的右子树放到左子树的右节点上
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right); 
        if(root.left!=null){
           TreeNode tem=root.right; 
            root.right=root.left;
            root.left=null;
            while(root.right!=null) root=root.right;
            root.right=tem;
        }
        
    }
}