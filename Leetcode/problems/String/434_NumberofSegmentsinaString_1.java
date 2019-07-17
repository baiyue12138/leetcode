class Solution {
    public int countSegments(String s) {
    	//从第二个单词起，每出现一个单词的条件必是空字符后出现非空字符，因此，只需统计空字符后紧跟着出现非空字符的次数即可。别忘了如果字符串刚开始就出现空字符，则不用加上第一个单词。
        int sum=0;
        int len=s.length();
        if(len==0) return 0;
        for(int i=0;i<len;i++){
        	char c=s.charAt(i);
        	if(c==' '){
        		if(i<len-1&&s.charAt(i+1)!=' ')
        			sum++;
        	}
        }
        if(s.charAt(0)==' ') sum--;
        return sum+1;
    }
}