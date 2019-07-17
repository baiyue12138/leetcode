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
//思路：计算每个节点的左右子树的高度，然后将高度相加，取最大值就是直径
	int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }
    //在计算每个节点为根的最大深度同时保存最大直径，因为最终结果不一定会过总根，所以每个结点为根都要遍历一次
    public int helper(TreeNode root){
        if(root == null)
            return 0;
        int Ldepth = helper(root.left);
        int Rdepth = helper(root.right);
        max = Math.max(max,Ldepth+Rdepth);
        return 1+Math.max(Ldepth,Rdepth);//返回此节点为根下的深度;
    }
}