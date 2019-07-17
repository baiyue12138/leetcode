class Solution {
//push[i]==pop[j]出栈，不相等的时候push[i]入栈
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length==0&&popped.length==0) return true;
        Stack<Integer>s=new Stack();
        int idx=0;
        while(pushed[idx]!=popped[0]){
        	s.push(pushed[idx++]);
        }
        idx++;
        for(int i=1;i<popped.length;i++){
        	if(!s.isEmpty()&&s.peek()==popped[i]){
        		s.pop();
        	}
        	else{
        		while(idx<pushed.length&&pushed[idx++]!=popped[i]){
        			s.push(pushed[idx-1]);
        		}
        		if(idx==pushed.length&&pushed[idx-1]!=popped[i]){
        			return false;
        		}
        	}
        }
        return true;
    }
}