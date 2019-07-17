class Solution {
    public int lengthOfLastWord(String s) {
          if(s.equals(" ")||s.length()==0){
         return 0;
     }
        int sum=0;
        int len=s.length();
        for(int i=len-1;i>=0;i--){
        	if(s.charAt(i)==' '){
        		
        		if(sum!=0)
        			break;
        		sum=0;
        	}else{
        		sum++;
        	}      	
        }
        return sum;
    }
}