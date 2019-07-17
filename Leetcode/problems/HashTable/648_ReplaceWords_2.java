//648.单词替换
class TrieNode{
	public char val;
	public boolean isEnd;//这里isEnd表示这个节点是否是词根的最后一个字符
	public  TrieNode[]son;
	TrieNode(){
		son=new TrieNode[26];
		isEnd=false;
	}
}
class Trie{
	TrieNode root=new TrieNode();
	public void insert(String word){
		if(word==null||word.length()==0) return;
		TrieNode node=root;
		char[]ch=word.toCharArray();
		for(char c:ch){
			int pos=c-'a';
			if(node.son[pos]==null){
				node.son[pos]=new TrieNode();
				node.son[pos].val=c;
			}
			node=node.son[pos];
		}
		node.isEnd=true;
	}
	public String search(String word){
		if(word==null||word.length()==0) return "";
		TrieNode node=root;
		char[]ch=word.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char c:ch){
			int pos=c-'a';
			if(node.son[pos]==null&&!node.isEnd){
				return word;//这个单词不存在前缀,返回自己本身
			}
			if(node.son[pos]==null||node.isEnd==true){
				return sb.toString();
			}else{
				sb.append(c);
			}
			node=node.son[pos];
		}
		return word;
	}
}
class Solution {
/**对词典建立一个字典树，然后在字典树上查找单词，返回前缀**/
	
    public String replaceWords(List<String> dict, String sentence) {
    	Trie trie=new Trie();
    	for(String word:dict){
    		trie.insert(word);
    	}
    	String[]sen=sentence.split(" ");
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<sen.length;i++){
    		String replace=trie.search(sen[i]);
    		sb.append(replace);
    		if(i!=sen.length-1){
    			sb.append(" ");
    		}
    	}
    	return sb.toString();
        
    }
}