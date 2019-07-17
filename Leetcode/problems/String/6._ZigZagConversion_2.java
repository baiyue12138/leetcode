class Solution {
/**
思路：每2*（numrows-1)个字符一组，，然后每2*（numrows-1)个数为一个间隔的读字符
https://blog.csdn.net/weixin_37887248/article/details/81452902
**/
    public String convert(String s, int numRows) {
    	StringBuilder sb=new StringBuilder();
    	int node_len=2*(numRows-1);
      if(numRows<=1||s.length()==0||s==null) return s;
    	for(int i=0;i<numRows;i++){//每一行
    		for(int j=i;j<s.length();j+=node_len){
    			sb.append(s.charAt(j));
    			if((i!=0&&i!=numRows-1)&&(j-2*i+node_len<s.length())){
    				sb.append(s.charAt(j-2*i+node_len));
    			}
    		}
    	}
    return sb.toString();   
    }
}