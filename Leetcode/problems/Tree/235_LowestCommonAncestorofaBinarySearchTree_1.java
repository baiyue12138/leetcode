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
//使用二叉搜索树的特性，如果根节点的值与这两个值之间的差的乘积小于0则返回该值，否则比这两值小则转到右节点，否则转到左节点
	public TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        lowest(root,p,q);
        return res;
    }
    public void lowest(TreeNode root, TreeNode p, TreeNode q){
    	if((root.val-p.val)*(root.val-q.val)<=0){
    		 res=root;
    	}else{
    		if(root.val<p.val&&root.val<q.val){
    			lowest(root.right,p,q);
    		}else{
    			lowest(root.left,p,q);
    		}
    	}
    }
}