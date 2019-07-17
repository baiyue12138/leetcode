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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //层次遍历要借助于队列
         List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(root==null){
         return list;
        }
         Queue<TreeNode>queue=new LinkedList<TreeNode>();
         queue.offer(root);
         while(!queue.isEmpty()){
             List<Integer> level=new ArrayList<Integer>();
             int size=queue.size();//每层的节点数量,注意这里
             for(int i=0;i<size;i++){
                 TreeNode curr=queue.poll();
                 level.add(curr.val);
                 if(curr.left!=null){
                     queue.offer(curr.left);
                 }
                 if(curr.right!=null){
                     queue.offer(curr.right);
                 }
                 
             }
             list.add(0,level);//每次都插在开头位置
         }
         return list;
        
    }
}