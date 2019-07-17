class Solution {
//遇到c,如果栈是空的就返回false，否则就退两次栈，最后判断栈是否为空。为空则true
    public boolean isValid(String S) {
        Stack<Character>s=new Stack();
        for(int i=0;i<S.length();i++){
        	if(S.charAt(i)!='c'){
        		s.push(S.charAt(i));
        	}else{
        		if(s.size()<2) return false;
        	if(s.pop()!='b') return false;
        		if(s.pop()!='a') return false;
        	}
        }
        return s.empty();
    }
}