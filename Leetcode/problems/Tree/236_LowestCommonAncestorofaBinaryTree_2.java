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
//递归搜索左右子树，如果左子树和右子树都不为空，说明最近父节点一定在根节点。反之，如果左子树为空，说明两个节点一定在右子树；同理如果右子树为空，说明两个节点一定在左子树。
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==root||q==root) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null) return root;
        if(left==null) return right;
        if(right==null) return left;
        return left==null?right:left;
    }
}