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
    public List<List<Integer>> levelOrder(Node root) {
    	List<List<Integer>>res=new ArrayList<List<Integer>>();
    	if(root==null) {return res;}
    	Queue<Node>queue=new LinkedList();
    	queue.offer(root);
        while(!queue.isEmpty()){
        	int size=queue.size();//每层节点的数量
        	List<Integer>t=new ArrayList();
        	for(int i=0;i<size;i++){
        		Node node=queue.poll();
        		t.add(node.val);
        		List<Node>child=node.children;
        		for(Node c:child){
        			queue.offer(c);
        		}
        	}
        	res.add(t);
        }
        return res;
    }
}