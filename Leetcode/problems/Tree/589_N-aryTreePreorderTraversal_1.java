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

    public List<Integer> preorder(Node root) {
    	List<Integer>res=new ArrayList();
    	if(root==null) return res;
    	Stack<Node>stack=new Stack();
    	stack.push(root);
    	while(!stack.isEmpty()){
    		Node node=stack.pop();
    		res.add(node.val);
    		List<Node> child=node.children;
    		for(int i=child.size()-1;i>=0;i--){
    			stack.push(child.get(i));
    		}
    	}
        return res;
    }
}

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
	List<Integer>res=new ArrayList();
    public List<Integer> preorder(Node root) {
        pre(root);
        return res;
    }
    public void pre(Node root){
    if(root!=null){
        	res.add(root.val);
        	for(Node node:root.children){
        		pre(node);
        	}
        }
    }
}

