class Solution {
    public boolean checkRecord(String s) {
    	boolean A=true,L=true;
        for(int i=0;i<s.length();){
        	char c=s.charAt(i);
        	if(c=='L'){
        		int j=i;
        		while(j<s.length()&&c==s.charAt(j)) j++;
        		if(j-i>2) return false;
        		i=j;
        		continue;
        	}
        	if(c=='A'){
        		int k=i;
        		int sum=0;
        		while(k<s.length()) {
        			if(c==s.charAt(k)){
        				sum++;
        			}
              if(sum>1) return false;
        			k++;
        		}
        		
        	}
          i++;
        }
        return A&&L;    
    }
}