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
    //需要用到栈
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> tree = new ArrayList<List<Integer>>();
        if(root == null)
            return tree;
        // rightstack 出栈序列是 左到右该层元素
        Stack<TreeNode> leftstack = new Stack<TreeNode>();
        leftstack.push(root);
        
        // leftstack 出栈序列是 右到左该层元素
        Stack<TreeNode> rightstack = new Stack<TreeNode>();
        boolean left = true;
        while(!leftstack.empty() || !rightstack.empty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(left){
                int size = leftstack.size();
                for(int i=0;i<size;i++){
                    TreeNode node = leftstack.pop();
                    list.add(node.val);
                    if(node.left!=null)
                        rightstack.push(node.left);
                    if(node.right!=null)
                        rightstack.push(node.right);
                    
                }
            }else{
                int size = rightstack.size();
                for(int i=0;i<size;i++){
                    TreeNode node = rightstack.pop();
                    list.add(node.val);
                    if(node.right!=null)
                        leftstack.push(node.right);
                    if(node.left!=null)
                        leftstack.push(node.left);
                    
                }
            }
            left=!left;
            tree.add(list);
        }
        return tree;
    }
}