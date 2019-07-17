class Solution {
    public String findLongestWord(String s, List<String> d) {
        String res="";
        for(String t:d){
        	int l1=res.length(),l2=t.length();
        	if(l1>l2||(l1==l2&&res.compareTo(t)<0)){
        		continue;
        	}
        	if(isValid(s,t)){
        		res=t;
        	}
        }
        return res;
    }
    boolean isValid(String s,String t){
    	int i=0,j=0;
    	while(i<s.length()&&j<t.length()){
    		if(s.charAt(i)==t.charAt(j)){
    			j++;
    		}
    		i++;
    	}
    	return j==t.length();
    }
}