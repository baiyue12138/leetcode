class Solution {
     public static String multiply(String num1, String num2) {
          if(num1.equals("0")||num2.equals("0")){
			 return "0";
		 }
		 int[]result=new int[num1.length()+num2.length()];
		 for(int i=0;i<num1.length();i++){
			 for(int j=0;j<num2.length();j++){
				 result[i+j+1]+=Integer.parseInt(String.valueOf(num1.charAt(i)))*Integer.parseInt(String.valueOf(num2.charAt(j)));
			 }
		 }
		 for(int i=result.length-1;i>0;i--){
			 if(result[i]>=10){		 
				 result[i-1]+=result[i]/10;
				 result[i]=(char)result[i]%10;
			 }
		 }
		 String s="";
         if(result[0]==0)
             {}else
			 	s+=result[0];
		 for(int i=1;i<result.length;i++)
			 	s+=result[i];		
		 return s;	 
	 }
}