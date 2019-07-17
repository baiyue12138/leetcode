class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character>s1 = null;
        Stack<Character>s2 = null;
        char[]c1=S.toCharArray();
        char[]c2=T.toCharArray();
        s1=pushS(c1);//入栈，并且遇到"#"退出栈
        s2=pushS(c2);
        while(!s1.empty()&&!s2.empty()){
        	if(s1.pop()!=s2.pop()){
        		return false;
        	}
        }
        if(!s1.empty()||!s2.empty()){//一个为空，一个非空
        	return false;
        }
        return true;
       
    }
    Stack pushS(char[]c){
    	 Stack<Character>s1 = new Stack<Character>();
    	 for(int i=0;i<c.length;i++){
        	if(c[i]!='#'){
        		s1.push(c[i]);
        	}else{
        		if(!s1.empty()){
        			s1.pop();
        		}
        	}
        }
        return s1;
    }
}