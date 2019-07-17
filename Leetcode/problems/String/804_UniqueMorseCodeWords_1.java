class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] pass={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
        	String word=createPass(words[i],pass);
        	if(!map.containsKey(word)){
        		map.put(word,1);
        	}
        }
        return map.size();
    }
    String createPass(String words,String[] pass){
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<words.length();i++){
    		char c=words.charAt(i);
    		sb.append(pass[c-'a']);
    	}
    	return sb.toString();
    }
}