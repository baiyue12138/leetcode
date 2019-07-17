class Node{
	int key;
	int value;
	Node next;
	public Node(int key,int value){
		this.key=key;
		this.value=value;
		this.next=null;
	}
}
class MyHashMap {
	Node []list;
	int size;
    /** Initialize your data structure here. */
    public MyHashMap() {
    	size=10007;
      	list=new Node[size];  
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hashKey=key%size;
        if(list[hashKey]==null){
        	list[hashKey]=new Node(key,value);
        }else{
        	Node e=list[hashKey];
        	while(e!=null&&e.key!=key){
        		e=e.next;
        	}
        	if(e==null){
        		Node en=new Node(key,value);
        		en.next=list[hashKey];
        		list[hashKey]=en;
        	}else{
        		e.value=value;
        	}
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
       int hashKey=key%size;
       Node e=list[hashKey];
       while(e!=null&&e.key!=key)
       	e=e.next;
       	return e==null?-1:e.value;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashKey=key %size;
        Node e=list[hashKey];
        Node pre=null;
        while(e!=null&&e.key!=key){
        	pre=e;
        	e=e.next;
        }
        if(e!=null){
        	if(pre == null)//删除的是头节点
                list[hashKey] = e.next;
            else
                pre.next = e.next;
        }
    }
}