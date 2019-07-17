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
	List<Integer> list=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
		if(root!=null){
			inorderTraversal(root.left);
			list.add(root.val);
			inorderTraversal(root.right);
		}
		return list;
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<Integer>();
        Stack<TreeNode>stack=new Stack<TreeNode>();
        TreeNode current=root;
        while(current!=null||!stack.isEmpty()){
            while(current!=null){
                stack.add(current);
                current=current.left;
            }
            current=stack.pop();
            list.add(current.val);
            current=current.right;
            
        }
        return list;
        
    }
}