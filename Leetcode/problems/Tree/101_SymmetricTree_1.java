/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//转为两个二叉树是否互为镜像
/**
*两个节点A和B对称等价于: 
*这两个节点上存储的值相等
*节点A的左子树节点和节点B的右子树上的节点是对称的
*节点A的右子树节点和节点A的左子树上的节点是对称的
*
**/
class Solution {
    
     
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        Stack<TreeNode>stack=new Stack<TreeNode>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty()){
            TreeNode right=stack.pop();
            TreeNode left=stack.pop();
            if(right==null&&left==null) continue;
            if(right==null||left==null) return false;//一个节点为空
            if(right.val!=left.val) return false;//两个节点值不相等
            stack.push(right.left);
            stack.push(left.right);
            stack.push(right.right);
            stack.push(left.left);
        }
        
        return true;
   
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
//转为两个二叉树是否互为镜像
/**
*两个节点A和B对称等价于: 
*这两个节点上存储的值相等
*节点A的左子树节点和节点B的右子树上的节点是对称的
*节点A的右子树节点和节点A的左子树上的节点是对称的
*
**/
class Solution {
    public boolean isSymmetric(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null||p.val!=q.val){
            return false;
        }
        return isSymmetric(p.left,q.right)&&isSymmetric(p.right,q.left);
    }
     
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.left,root.right);
   
    }
}