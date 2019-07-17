class Solution {
/**
思路：1.将字符串转为字符数组
2.设置两个指针分别指向数组的前后
3.设置循环
4.如果c[i]不是字符或者数子，则i++
如果c[j]不是字符或者数子，j--
如果c[i]和c[j]都是数字或者字符并且c[i]==c[j]则i++,j--
否则就不是回文串，return false
**/
    public boolean isPalindrome(String s) {
      char[] c=s.toCharArray();
      int i=0, j=c.length-1;
      while(i<j){
      	if(!isDiChar(c[i])){
      		i++;
      	}else{
      		if(!isDiChar(c[j])){
      			j--;
      		}else{
      			if(toLow(c[i])==toLow(c[j])){
      				i++;
      				j--;
      			}else{
      				return false;
      			}
      		}
      	}
      }
      return true;
    }
    boolean isDiChar(char c){
    	if(c<='9'&&c>='0') return true;
    	if(c>='A'&&c<='Z') return true;
    	if(c>='a'&&c<='z') return true;
    	return false;
    }
     char toLow(char c){
    	if(c>='A'&&c<='Z') return (char)((int)c+32);
        return c;
    }
}