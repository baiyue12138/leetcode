class Solution {
	//遇到 “.”不用处理，遇到“..”要跳过当前目录
    public String simplifyPath(String path) {
    	StringBuilder sb=new StringBuilder();
    	Stack<String>stack=new Stack<>();
    	String[]pathlist=path.split("/");
    	for(String p:pathlist){
    		if(p.length()>0) stack.push(p);
    	}
    	int pop=0;//用来记录“。。”的数量
    	while(!stack.isEmpty()){
    		String s=stack.pop();
    		if(s.equals("..")) pop++;
    		else{
    			if(!s.equals(".")){
    				if(pop>0) pop--;
    				else{
    					sb.insert(0,"/"+s);
    				}
    		}
    	}      
    }
    return sb.length()==0?"/":sb.toString();
}
}