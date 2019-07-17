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
	List<Integer>res1=new ArrayList();
	List<Integer>res2=new ArrayList();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        inorder1(root1);
        inorder2(root2);
        if(res1.size()!=res2.size()) return false;
        for(int i=0;i<res1.size();i++){
        	if(res1.get(i)!=res2.get(i)){
        		return false;
        	}
        }
        return true;
    }
    public void inorder1(TreeNode root){
    	if(root!=null){
    		inorder1(root.left);
    		if(root!=null&&root.left==null&&root.right==null){
    			res1.add(root.val);
    		}
    		inorder1(root.right);
    	}
    }
	public void inorder2(TreeNode root){
    	if(root!=null){
    		inorder2(root.left);
    		if(root!=null&&root.left==null&&root.right==null){
    			res2.add(root.val);
    		}
    		inorder2(root.right);
    	}
    }

}