/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
*
*假设选择i作为分界点，那么左子树由[1:i−1]范围的值组成，右子树由[i+1:n]范围内的值组成
*通过[1:i−1]这i-1个数可以构成多个不同的二叉搜索树，假设是leftTree1，leftTree2,....,leftTreeL
*通过[i+1:n]这n-i个数可以构成多个不同的二叉搜索树，假设是rightTree1,rightTree2,...,rightTreeR
*那么可知以i作为根节点的二叉搜索树共有L∗R个，另这些树依次组成即可求出这L∗R个树
**/
class Solution {
    //递归
    public List<TreeNode> generateTreeNodes(List<Integer>num){
        if(num.size()==0){
            return null;
        }
        List<TreeNode>result=new ArrayList<TreeNode>();
        for(int i=0;i<num.size();i++){//每个节点作为根节点
            List<TreeNode> lefts=generateTreeNodes(num.subList(0,i));//不包括i
            List<TreeNode>rights=generateTreeNodes(num.subList(i+1,num.size()));
            if(lefts!=null){
                /**
                *左右子树组合
                */
                for(TreeNode left:lefts){//左边每一个子树
                    if(rights!=null){
                        for(TreeNode right:rights){//右边每个子树
                           TreeNode root=new TreeNode(num.get(i));
                            root.left=left;
                            root.right=right;
                            result.add(root);
                        }
                    }else{//右子树为空
                         TreeNode root=new TreeNode(num.get(i));
                            root.left=left;
                            root.right=null;
                            result.add(root);
                    }
                    
                }
            }else{//左子树为空
                if(rights!=null){
                        for(TreeNode right:rights){//右边每个子树
                           TreeNode root=new TreeNode(num.get(i));
                            root.left=null;
                            root.right=right;
                            result.add(root);
                        }
                    }else{//右子树为空
                         TreeNode root=new TreeNode(num.get(i));
                            root.left=null;
                            root.right=null;
                            result.add(root);
                    }
            }
        }
        return result;
       
    }
    public List<TreeNode> generateTrees(int n) {
        List<Integer>num=new ArrayList<>();
        if(n==0) return new ArrayList<>();
        for(int i=0;i<n;i++){
            num.add(i+1);
        }
        return generateTreeNodes(num);
        
    }
}