class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[]map=new int[26];
        for(int i=0;i<order.length();i++){
        	map[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length-1;i++){
        	if(compare(words[i],words[i+1],map)==false) return false;
        }
        return true;
    }
    boolean compare(String a,String b,int[]map){
    	int i=0;
    	int len1=a.length();
    	int len2=b.length();
    	while(i<len1&&i<len2){
    		int index1=map[a.charAt(i)-'a'];
    		int index2=map[b.charAt(i)-'a'];
    		if(index1!=index2){
    			return index1<index2;
    		}
    		i++;
    	}
    	if(len1>len2) return false;
    	return true;
    }
}