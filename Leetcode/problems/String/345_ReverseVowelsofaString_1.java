class Solution {
    public String reverseVowels(String s) {
        char[]c=s.toCharArray();
        int i=0,j=c.length-1;//设置左右指针
        while(i<j){
        	if(isAeiou(c[i])&&isAeiou(c[j])){
        		//交换
        		char t=c[i];
        		c[i]=c[j];
        		c[j]=t;
            i++;
            j--;
        	}else{
        		if(!isAeiou(c[i])){
        			i++;
        		}else{
        			j--;
        		}
        	}
        }
        return String.valueOf(c);
    }
    boolean isAeiou(char c){
    //判断是否是元音字母AEiou
    	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
    		return true;
    	}
    	return false;
    }
}