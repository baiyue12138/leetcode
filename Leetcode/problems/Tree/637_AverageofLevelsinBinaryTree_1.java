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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double>list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode>queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();//每一层节点的数量
            double sum=0.0;
            for(int i=0;i<size;i++){
               TreeNode curr=queue.poll();
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
               sum+=curr.val;
            }
            
            list.add(sum/size);    
        }
        return list;
    }
}