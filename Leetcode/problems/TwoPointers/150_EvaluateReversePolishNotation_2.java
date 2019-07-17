class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack();
        for(int i=0;i<tokens.length;i++){
        	switch(tokens[i]){
        		case "+":{
        			s.push(s.pop()+s.pop());
        			break;
        		}
        		case "-":{
        			int t2=s.pop();
        			int t1=s.pop();
        			s.push(t1-t2);
        			break;
        		}
        		case "*":{
        			s.push(s.pop()*s.pop());
        			break;
        		}
        		case "/":{
        			int t2=s.pop();
        			int t1=s.pop();
        			s.push(t1/t2);
        			break;
        		}
        		default:{
        			s.push(Integer.valueOf(tokens[i]));
        		}
        	}
        }
        return s.pop();
    }
}