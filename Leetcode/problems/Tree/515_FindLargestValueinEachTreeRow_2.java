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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode>queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();//每一层节点的数量
            TreeNode curr=queue.poll();
            int max=curr.val;
            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null) queue.add(curr.right);
            for(int i=1;i<size;i++){
                curr=queue.poll();
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
                if(max<curr.val){
                    max=curr.val;
                }
            }
            list.add(max);    
        }
        return list;
    }
}