class Solution {
/**
思路：遇到（就入栈，遇到）需要计算这个括号中的数值大小，然后将数值也入栈
**/
    public int scoreOfParentheses(String S) {
    	Stack<String>stack=new Stack();
    	int len=S.length();
    	if(len<=0) return 0;
    	for(int i=0;i<len;i++)
    	{
    		String c=String.valueOf(S.charAt(i));
    		if(c.equals("(")){
    			stack.push(c);
    		}else{
    			int tem=0;
    			while(!stack.isEmpty()){
    				String t=stack.pop();
    				if(!t.equals("(")){//是数值
    					tem+=Integer.parseInt(t);
    				}else{//"("
    					break;
    				}
    			}
    			if(tem==0){
    				stack.push("1");
    			}else{
    				stack.push(String.valueOf(2*tem));
    			}
    		}
    	}
      int sum=0;
    	while(!stack.isEmpty()){
    		sum+=Integer.parseInt(stack.pop()); 
    	}
     return sum;
    }
}