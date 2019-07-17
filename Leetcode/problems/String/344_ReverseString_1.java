class Solution {
    public void reverseString(char[] s) {
        int len =s.length;
        int i=0,j=len-1;
        while(i<j){
        	char t=s[i];
        	s[i]=s[j];
        	s[j]=t;
          i++;
          j--;
        }
    }
}