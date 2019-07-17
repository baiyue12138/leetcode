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
    public TreeNode build(int[]nums,int start,int end){
        if(nums.length==0) return null;
        if(start>end) return null;
        int mid=(end+start)/2;
        TreeNode root=new TreeNode(nums[mid]);
        TreeNode left=build(nums,start,mid-1);
        TreeNode right=build(nums,mid+1,end);
        root.left=left;
        root.right=right;
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return build(nums,0,nums.length-1);
    }
}