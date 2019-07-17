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
    private int xLevel = 0;
    private int yLevel = 0;
    private int xParent = 0;
    private int yParent = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        loop(root, x, y, 0, 0);//先序遍历
        return xLevel > 0 && xLevel == yLevel && xParent!= yParent;
    }

    private void loop(TreeNode root, int x, int y, int level, int parent){
        if (root == null){
            return;
        }
        if (x == root.val){
            xLevel = level;
            xParent = parent;
        }else if (y == root.val){
            yLevel = level;
            yParent = parent;
        }
        loop(root.left, x, y, level+1, root.val);
        loop(root.right, x, y, level+1, root.val);
    }
}


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
//使用层序遍历
	Map<Integer,Integer>height=new HashMap();//用来保持每个节点的高度
	Map<Integer,Integer>parent=new HashMap(); //用来保存每个节点的父亲节点
    public boolean isCousins(TreeNode root, int x, int y) {
    	if(root==null) return false;
        Queue<TreeNode>queue=new LinkedList();
        int h=0;
        queue.offer(root);
        height.put(root.val,0);
        parent.put(root.val,null);
        int size=1;
        while(!queue.isEmpty()){
        	TreeNode node=queue.poll();
        	if(node.left!=null){
        		queue.offer(node.left);
        		height.put(node.left.val,h+1);
        		parent.put(node.left.val,node.val);
        	}
        	if(node.right!=null){
        		queue.offer(node.right);
        		height.put(node.right.val,h+1);
        		parent.put(node.right.val,node.val);
        	}
        	size--;
        	if(size==0){
        		h+=1;
        		size=queue.size();
        	}
        }
        if(height.get(x)==height.get(y)&&parent.get(x)!=parent.get(y)){
        	return true;
        }
        return false;
    } 
}