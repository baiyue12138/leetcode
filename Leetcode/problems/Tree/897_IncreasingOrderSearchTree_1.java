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
//笨方法：先中序遍历存进list,然后重新建立树
	List<Integer>res=new ArrayList();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        inorder(root);
        TreeNode troot=new TreeNode(res.get(0));
        troot.left=null;
        troot.right=null;
        TreeNode pre=troot;
        for(int i=1;i<res.size();i++){
        	pre.right=new TreeNode(res.get(i));
        	pre.left=null;
        	pre=pre.right;
        }
        return troot;
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		res.add(root.val);
    		inorder(root.right);
    	}

    }
}