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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<Integer>();
        if(root==null){
            return list;
        }
        Stack<TreeNode>s=new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode curr=s.pop();//先出根节点，然后出右节点，最后出左节点，，然后将结果插入list的头部，输出顺序就变为左右根的顺序
            list.add(0,curr.val);
            if(curr.left!=null){
                s.push(curr.left);
            }
            if(curr.right!=null){
                s.push(curr.right);
            }
        }
        return list;
    }
}