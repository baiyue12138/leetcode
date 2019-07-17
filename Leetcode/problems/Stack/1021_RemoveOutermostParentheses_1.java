class Solution {
//思路：遇到左括号入栈，遇到右括号出栈，如果出栈时栈中元素个数为1 则表示为原语，则出栈不添加进结果
    public String removeOuterParentheses(String S) {
    	if(S==null||S.length()==0) return "";
      	String res="";
        int sum = 0;
        for(int i = 0; i<S.length(); ++i){
            if(S.charAt(i)=='('){
                ++sum;
                if(sum != 1) res+=S.charAt(i);
            }
            else
            {
                --sum;
                if(sum != 0) res+=S.charAt(i);
            }
        }
        return res;
    }
}