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
    public int findPosition(int[]in,int is,int ie,int key){
        for(int i=is;i<=ie;i++){
            if(in[i]==key){
                return i;
            }
        }
        return -1;
    }
    public TreeNode myBuildTree(int[]pre,int ps,int pe,int[]in,int is,int ie){
        if(is>ie){
            return null;
        }
        TreeNode root=new TreeNode(pre[pe]);
        int position=findPosition(in,is,ie,pre[pe]);//根节点的位置
        root.left=myBuildTree(pre,ps,ps+position-is-1,in,is,position-1);
        root.right=myBuildTree(pre,ps+position-is,pe-1,in,1+position,ie);
        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         if(inorder.length!=postorder.length){
            return null;
        }
        return myBuildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
}