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
        TreeNode root=new TreeNode(pre[ps]);
        int position=findPosition(in,is,ie,pre[ps]);//根节点的位置
        root.left=myBuildTree(pre,ps+1,ps+position-is,in,is,position-1);
        root.right=myBuildTree(pre,ps+position-is+1,pe,in,1+position,ie);
        return root;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length!=inorder.length){
            return null;
        }
        return myBuildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        
    }
}