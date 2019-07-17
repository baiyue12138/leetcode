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
	//思路：使用层序遍历，获得第d-1行的节点，然后创建新节点重新连接节点，结束，然后root
    public TreeNode addOneRow(TreeNode root, int v, int d) {
    	if (d<0) return root;
    	if(d==1){
    		TreeNode node=new TreeNode(v);
    		node.left=root;
    		return node;
    	}else{
    		int depth=1;
    		Queue<TreeNode>queue=new LinkedList();
    		queue.offer(root);
    		while(!queue.isEmpty()){
    			int size=queue.size();
    			for(int i=0;i<size;i++){
    				TreeNode node=queue.poll();
    				if(depth==d-1){
    					TreeNode left=new TreeNode(v);
    					TreeNode right=new TreeNode(v);
    					left.left=node.left;
    					right.right=node.right;
    					node.left=left;
    					node.right=right;
    				}
    				if(node.left!=null) queue.offer(node.left);
    				if(node.right!=null) queue.offer(node.right);
    			}
    			depth++;
    		}
    	}
     return root;  
    }
}