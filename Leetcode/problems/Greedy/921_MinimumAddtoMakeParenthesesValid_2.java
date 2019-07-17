class Solution {
//"()))(("
    public int minAddToMakeValid(String S) {
        Stack<Character> stack=new Stack<>();
        char[]c=S.toCharArray();
        int sum=0;
        for(int i=0;i<c.length;i++){
        	if(c[i]=='('){
        		stack.push(c[i]);
        	}
        	if(c[i]==')'){
        		if(stack.empty()||stack.pop()!='('){
        			sum++;
        		}
        	}
        }
        sum+=stack.size();
        return sum;
    }
}