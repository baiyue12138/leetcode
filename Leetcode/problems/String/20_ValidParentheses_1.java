class Solution {
   public boolean isValid(String s) {
		 char[]ch=s.toCharArray();
		 ArrayList<Character> list=new ArrayList<Character>();
		 for(char c:ch){
			 if(c=='{'||c=='('||c=='[')
			 {
				 list.add(c);
			 }else{
				 if(!list.isEmpty()){
					 char c2= list.get(list.size()-1);
					list.remove(list.size()-1);
					 if(c==']'&&c2!='[')
					 {
						
						 return false;
					 }
					 if(c=='}'&&c2!='{')
					 {
						
						 return false;
					 }
					 if(c==')'&&c2!='(')
					 {
						
						 return false;
					 }
				 }else{
					 return false;
				 }
				
				
			 }
		 }
		 if(!list.isEmpty()){
			 return false;
		 }
	        return true;
	    }
}