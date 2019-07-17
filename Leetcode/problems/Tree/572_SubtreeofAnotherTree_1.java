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
    //判断t是否为s的子树，和判断两个树是否为镜像相似
    //判断s和t相似
    public boolean sist(TreeNode s,TreeNode t){
        if(s==null&&t==null) return true;
        if(s==null||t==null) return false;
        if(s.val!=t.val) return false;
        return sist(s.left,t.left)&&sist(s.right,t.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null) return true;
        if(s==null||t==null) return false;
        boolean result=false;
        if(s.val==t.val){
          result=sist(s,t);
        }
        if(!result){//s不=t,左子树查找
           result=isSubtree(s.left,t);      
            }
        if(!result){//s不=t,右子树查找
            result=isSubtree(s.right,t);
               
            }
       return result;  
    }
}