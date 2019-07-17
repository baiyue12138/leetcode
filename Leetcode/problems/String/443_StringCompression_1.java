class Solution {
    public int compress(char[] chars) {
    	int sum=0;
    	int len=chars.length;
    	int cur=0;//插入的位置,表示新数组的遍历指针
    	for(int i=0;i<len;){
    		char c=chars[i];
    		int j=i;
    		int k=0;
    		while(j<len&&chars[i]==chars[j]){
    			k++;
    			j++;
    		}
    		chars[cur++]=chars[i];//插入当前字符
    		//插入数字
    		if(k==1){
    			sum+=1;
    		}else{
    			String t=k+"";
    			sum+=1+t.length();
    			for(int p=0;p<t.length();p++){
    				chars[cur++]=t.charAt(p);
    			}
    		}
    		i=j;
    	}
      return sum;  
    }
}