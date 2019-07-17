class Solution {
    public boolean detectCapitalUse(String word) {
    //思路：统计字符串中大写小写字符的数量
    //如果首字符是大写并且大写字符的数量=字符串的长度则true
    //如果首字符为大写并且小写字符的数量=字符串的长度则true
    //如果首字符是小写，并且大写字符的数量为0 则true
    	int len=word.length();
        if(word==null||len==0) return true;
        char first=word.charAt(0);
        int small=0,big=0;
        for(int i=1;i<len;i++){
        	char c=word.charAt(i);
        	if(c>='a'&&c<='z') small++;
        	if(c>='A'&&c<='Z') big++;
        }
        if(first>='a'&&first<='z'&&big==0) return true;
        if(first>='A'&&first<='Z'&&(big==len-1||small==len-1)) return true;
        return false;
    }
}