class Solution {
//使用数组和一个栈顶指针来模拟栈
    public String removeDuplicates(String S) {
    	int len=S.length();
    	if(len<=0) return "";
       char[]res=new char[len];
       int cur=-1;
       char[]ch=S.toCharArray();
       for(char c:ch){
       		if(cur<0){//栈空
       			res[++cur]=c;
       		}else{
       			if(c==res[cur]){
       				cur--;
       			}else{
       				res[++cur]=c;
       			}
       		}
       }
       return new String(res,0,cur+1);
    }
}