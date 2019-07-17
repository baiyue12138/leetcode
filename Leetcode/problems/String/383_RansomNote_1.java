class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    //这道题不可以简单的只是遍历两个字符串
    	int len1= ransomNote.length();
    	int len2=magazine.length();
    	int[] hash=new int[26];
    	for(int i=0;i<len2;i++){
    		hash[magazine.charAt(i)-'a']++;
    	}
    	for(int j=0;j<len1;j++){
    		int k=--hash[ransomNote.charAt(j)-'a'];
    		if(k<0) return false;
    	}
    	return true;
    }
}