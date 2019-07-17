class Solution {
    public String toGoatLatin(String S) {
    	StringBuilder sb=new StringBuilder();
    	String[]s=S.split(" ");
    	for(int i=0;i<s.length;i++){
    		String res=goatLatin(s[i],i+1);
    		sb.append(res);
    		if(i<s.length-1) sb.append(" ");
    	}
    	return sb.toString();
        
    }
    String goatLatin(String s,int k){
    	StringBuilder sb=new StringBuilder();
    	char c=s.charAt(0);
    	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
    	c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
    		sb.append(c);
    	}
    	for(int i=1;i<s.length();i++){
    		sb.append(s.charAt(i));
    	}
    	if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&
    	c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'){
    		sb.append(c);
    	}
    	sb.append("ma");
    	while(k>0){
    		sb.append('a');
    		k--;
    	}
    	return sb.toString();
    }
}