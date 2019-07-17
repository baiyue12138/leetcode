class Solution {
    public boolean isSubsequence(String s, String t) {
    	int currp=0;
    	int len1=s.length();
    	int len2=t.length();
        for(int i=0;i<len1;i++){
        	if(currp>=len2) return false;//上一个相同的字符已经到t的最后一个位置
        	for(int j=currp;j<len2;j++){
        		if(s.charAt(i)==t.charAt(j)){
        			currp=j+1;
        			break;
        		}else{
        			if(j==len2-1){//没找到该字符
        				return false;
        			}
        		}
        	}
        }
        return true;
    }
}