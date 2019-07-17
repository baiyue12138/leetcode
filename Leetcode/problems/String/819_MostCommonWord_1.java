class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    	if(paragraph==null||paragraph.length()==0) return "";
        String lower=paragraph.toLowerCase();
        lower=removeOther(lower);
        String[]str=lower.split(" ");
        Map<String,Integer>map=new HashMap<String,Integer>();
        for(int i=0;i<str.length;i++){
        	if(!str[i].equals(" ")&&!str[i].equals("")){
        		if(!map.containsKey(str[i])){
            		map.put(str[i],1);
            	}else{
            		map.put(str[i],map.get(str[i])+1);
            	}
        	}
        }
        int max=0;
        String maxStr="";
        for(int i=0;i< banned.length;i++){
        	if(map.containsKey(banned[i])){
        		map.put(banned[i],-1);
        	}
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
        	if(entry.getValue()>max){
        		max=entry.getValue();
        		maxStr=entry.getKey();
        	}
         }
         return maxStr;
    }
    String removeOther(String s){
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<s.length();i++){
    		char c=s.charAt(i);
    		if(c>='a'&&c<='z'||c==' '){
    			sb.append(c);
    		}else{
    			sb.append(" ");
    		}
    	}
    	return sb.toString();
    }
}