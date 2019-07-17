class Solution {
    public boolean validPalindrome(String s) {
    //使用双指针，在第一个不相等的位置略过左边或右边的一个字符，用一个函数判断s从left到right是否是回文子字符串，即可。
      char[] c=s.toCharArray();
      boolean flag=true;
      int i=0, j=c.length-1;
      while(i<j){
      	if(c[i]!=c[j]){
      		return isPalin(c,i+1,j)||isPalin(c,i,j-1);//略过左边一个字符或者右边一个字符，然后判断中间的字符串是不是回文串
      	}
      	i++;
      	j--;
      }
      return true;
    }
    boolean isPalin(char[]c,int i,int j){
    	while(i<j){
    		if(c[i]!=c[j]) return false;
    		i++;
    		j--;
    	}
    	return true;
    }   
}