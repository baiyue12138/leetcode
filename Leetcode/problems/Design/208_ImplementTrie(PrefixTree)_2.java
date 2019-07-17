class TrieNode{
	public boolean isEnd;//判断是否为叶子节点
	public int num;//通过这个节点的单词数量
	public TrieNode[]son;//孩子节点
	public char val;//节点的值
	TrieNode(){
		this.num=1;
		this.isEnd=false;
		son=new TrieNode[26];
	}
}
class Trie {
	public TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
    	root=new TrieNode();    
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word==null||word.length()==0) return;
        TrieNode node=root;
        char[]ch=word.toCharArray();
        for(char c:ch){
        	int pos=c-'a';
        	if(node.son[pos]==null){
        		node.son[pos]=new TrieNode();
        		node.son[pos].val=c;
        	}else{
        		node.son[pos].num++;
        	}
        	node=node.son[pos];
        }
        node.isEnd=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word==null||word.length()==0) return false;
        TrieNode node=root;
        char[]ch=word.toCharArray();
        for(char c:ch){
        	int pos=c-'a';
        	if(node.son[pos]==null){
        		return false;
        	}
        	node=node.son[pos];
        }
       	return node.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix==null||prefix.length()==0) return false;
        TrieNode node=root;
        char[]ch=prefix.toCharArray();
        for(char c:ch){
        	int pos=c-'a';
        	if(node.son[pos]==null){
        		return false;
        	}
        	node=node.son[pos];
        }
       	return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */