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
//思路：使用层序遍历，保存每层的最后一个节点
	List<Integer>res=new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return res;
      	Queue<TreeNode>queue=new LinkedList();
      	queue.offer(root);
      	while(!queue.isEmpty()){
      		int size=queue.size();
      		for(int i=0;i<size;i++){
      			TreeNode node=queue.poll();
      			if(i==size-1) res.add(node.val);
      			if(node.left!=null) queue.offer(node.left);
      			if(node.right!=null) queue.offer(node.right);
      		}
      	}
        return res;
    }
   
}