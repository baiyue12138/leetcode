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
  //思路：先找到前一个节点
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0) return null;
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
        	TreeNode node=new TreeNode(preorder[i]);
        	TreeNode pre=preorder(root,preorder[i]);
        	if(node.val>pre.val){
        		pre.right=node;
        	}else{
        		pre.left=node;
        	}
        }
        return root;
    }
    public TreeNode preorder(TreeNode root,int val){
    	TreeNode res=root;
    	while(root!=null){
    		res=root;
    		if(root.val>val){
    			root=root.left;
    		}else{
    			root=root.right;
    		}
    	}
    	return res;
    }
}
