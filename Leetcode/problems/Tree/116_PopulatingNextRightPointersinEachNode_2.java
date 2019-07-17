/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    //队列方法不是常量级，这里有另一种解法
    public Node connect(Node root){
       if(root==null) return root;
       Node pre=root;
       Node curr=null;
       while(pre.left!=null){
       	curr=pre;
       	while(curr!=null){//处理每一层
       		curr.left.next=curr.right;
       		if(curr.next!=null) curr.right.next=curr.next.left;
       		curr=curr.next;
       	}
       	pre=pre.left;
       }
       return root;
    }
}