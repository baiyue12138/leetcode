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
  //思路：中序遍历和二分查找相结合
	List<Integer>res=new ArrayList();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int l=0,r=res.size()-1;
        while(l<r){
        	int t=res.get(l)+res.get(r);
        	if(t==k) return true;
        	else{
        		if(t>k) r--;
        		else l++;
        	}
        }
        return false;
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		res.add(root.val);
    		inorder(root.right);
    	}
    }
}