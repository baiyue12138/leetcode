class WordDictionary {
/**将单词存进map,key的word的长度，value是一个单词列表，然后找到相同长度的单词列表，一一比较每个字符**/
	Map<Integer,List<String>>map;
  /** Initialize your data structure here. */
  public WordDictionary() {
      map=new HashMap<>();
  }
  
  /** Adds a word into the data structure. */
  public void addWord(String word) {
  	if(word==null||word.length()==0) return;
  	int len=word.length();
  	if(map.containsKey(len)){
  		map.get(len).add(word);
  	}else{
  		List<String>list=new ArrayList<>();
  		list.add(word);
  		map.put(len,list);
  	}
  }
  
  /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
  public boolean search(String word) {
  	if(word==null||word.length()==0) return false;
  	boolean flag=false;
  	int len=word.length();
  	if(map.containsKey(len)){
  		List<String>list=map.get(len);
  		for(String str:list){
  			int i=0;
  			for(;i<len;i++){
  				if(word.charAt(i)!=str.charAt(i)&&word.charAt(i)!='.'){
  					break;
  				}
  			}
  			if(i==len){
  				flag=true;
  				break;
  			}
  		}
  	} else{
  		flag=false;
  	}
  	return flag;
  }
}