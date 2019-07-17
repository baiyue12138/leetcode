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
    /*
    *1.遍历每一个节点；2.判断以该节点为跟的路径是否满足要求
    */
    
    public int bfs1(TreeNode root, int sum){
        //判断以该节点为跟的路径是否满足要求
        int res=0;
        if(root==null) return 0;
        if(root.val==sum) res++;//该节点有几条路径满足要求
        res+=bfs1(root.left,sum-root.val);
        res+=bfs1(root.right,sum-root.val);
        return res;
    }
    public int pathSum(TreeNode root, int sum) {
         //遍历每一个节点
        //判断当前节点有满足要求的路径数量
        if(root==null) return 0;
        int curr=bfs1(root,sum);//root为跟，满足条件的路径数量
        int left=pathSum(root.left,sum);
        int right=pathSum(root.right,sum);
        return curr+right+left;
       
    }
}