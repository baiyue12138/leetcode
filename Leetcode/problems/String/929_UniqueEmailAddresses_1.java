class Solution {
    public int numUniqueEmails(String[] emails) {
    	int len=emails.length;
    	if(len==0) return 0;
    	HashMap<String, Integer> map=new HashMap<>();
    	for(int i=0;i<len;i++){
    		String s=uniqueEmails(emails[i]);
        System.out.println(s);
    		if(!map.containsKey(s)){
    			map.put(s,1);
    		}
    	}
    	return map.size();
        
    }
    String uniqueEmails(String email){
    	StringBuilder sb=new StringBuilder();
    	String[]e=email.split("@");
    	for(int i=0;i<e[0].length();i++){
    		char c=e[0].charAt(i);
    		if(c=='+'){
    			break;
    		}else{
    		if(c!='.'){
    			sb.append(c);
    		}
    		}
    	}
      sb.append("@");
    	sb.append(e[1]);
    	return sb.toString();
    }
}