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
    public List<Integer> postorder(Node root) {
        post(root);
        return res;
    }
    public void post(Node root){
    if(root!=null){
        	for(Node node:root.children){
        		post(node);
        	}
      res.add(root.val);
        }
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
    public List<Integer> postorder(Node root) {
    	List<Integer>res=new ArrayList();
    	if(root==null) return res;
    	Stack<Node>stack=new Stack();
    	stack.push(root);
    	while(!stack.isEmpty()){
    		Node node=stack.pop();
    		res.add(0, node.val);
    		List<Node> child=node.children;
    		for(int i=0;i<child.size();i++){
    			stack.push(child.get(i));
    		}
    	}
        return res;
    }
}
