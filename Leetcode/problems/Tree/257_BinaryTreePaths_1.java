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
    public void paths(TreeNode root,List<String>list,String s){
        if(root==null) return;
        s+=root.val+" ";
        if(root.left==null&&root.right==null){
            list.add(s.trim().replaceAll(" ","->"));
        }
        paths(root.left,list,s);
        paths(root.right,list,s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>list=new ArrayList<>();
        if(root==null) return list;
        paths(root,list," ");
        return list;
    }
}