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
	int res=0;
  int k=0;
	public void order(TreeNode root){
		if(root!=null){
			order(root.left);
			if (k==1) res=root.val;
      k--;
			order(root.right);
      
		}
	}
    public int kthSmallest(TreeNode root, int k) {
      this.k=k;
        order(root);
        return res;
    }
}
