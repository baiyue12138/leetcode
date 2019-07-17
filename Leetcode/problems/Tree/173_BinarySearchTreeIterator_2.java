/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
	TreeNode root;
	Queue<Integer>queue;
    public BSTIterator(TreeNode root) {
        this.root=root;
        this.queue=new LinkedList();
        inorder(this.root);
    }
    public void inorder(TreeNode root){
    	if(root!=null){
    		inorder(root.left);
    		queue.offer(root.val);
    		inorder(root.right);
    	}
    }
    /** @return the next smallest number */
    public int next() {
        int res=queue.poll();
        return res;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       if(!queue.isEmpty()) return true;
       return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */