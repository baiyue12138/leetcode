/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
    	int max=0;
        if(root==null) return 0;
        List<Node>child=root.children;
        for(Node n:child){
        	int depth=maxDepth(n);
        	max=Math.max(max,depth);
        }
        return max+1;
    }
}