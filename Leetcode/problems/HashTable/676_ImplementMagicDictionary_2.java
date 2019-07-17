class MagicDictionary {
/**
思路：建立一个string数组
然后转为字符数组
然后比较字符数组
只要有一个不一样就true，否则false
**/
	public List<String>list;
    /** Initialize your data structure here. */
    public MagicDictionary() {
    	this.list=new ArrayList<>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(int i=0;i<dict.length;i++){
        	this.list.add(dict[i]);
          //System.out.println(dict[i]);
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        for(int i=0;i<this.list.size();i++){
        	if(word.length()!=this.list.get(i).length()){
        		continue;
        	}else{
            int num=0;
        		char[]a=this.list.get(i).toCharArray();
        		char[]b=word.toCharArray();        		
        		for(int j=0;j<b.length;j++){
        			if(num>1) break;
        			if(a[j]!=b[j]){
        				num++;
        			}
        		}
        		if(num==1) return true;
        	}
        }
        return false;
    }
}
/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */
