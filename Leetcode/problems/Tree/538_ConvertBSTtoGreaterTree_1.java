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
//思路：首先求和所有数的累加和sum，然后再中序遍历，用累加和sum减去该节点之前数的累加pre代替该节点值，然后更新pre
	int pre=0;
	int sum=0;
    public TreeNode convertBST(TreeNode root) {
        inorder(root);
        update(root);
        return root;
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		sum+=root.val;
    		inorder(root.right);
    	}
    }
    public void update(TreeNode root){
    	if(root!=null){
    		update(root.left);
    		int value=root.val;
    		root.val=sum-pre;
    		pre+=value;
    		update(root.right);
    	}
    }

}