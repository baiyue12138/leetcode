/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//思路：二叉搜索树的中序遍历是一个升序序列，逐个比对当前结点(root)值与前驱结点（pre)值。更新当前节点值出现次数(curTimes)及最大出现次数(maxTimes)，更新规则：若curTimes=maxTimes,将root->val添加到结果向量(res)中；若curTimes>maxTimes,清空res,将root->val添加到res,并更新maxTimes为curTimes。
class Solution {
	int maxtimes=0;
	int currtimes=0;
	TreeNode pre=null;
	List<Integer>list=new ArrayList();
    public int[] findMode(TreeNode root) {
      pre=root;
   		inorder(root);
   		int res[]=new int[list.size()];
   		for(int i=0;i<list.size();i++){
   			res[i]=list.get(i);
   		}
   		return res;
        
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		if(pre!=null){
    			currtimes=root.val==pre.val?currtimes+1:1;
    			if(currtimes==maxtimes) {
    				list.add(root.val);
    			}else{
    				if(currtimes>maxtimes){
    					maxtimes=currtimes;
    					list.clear();
    					list.add(root.val);
    				}
    			}
    		}
    		pre=root;
    		inorder(root.right);
    	}
    }
}
