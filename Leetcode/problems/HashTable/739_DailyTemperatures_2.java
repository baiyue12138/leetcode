class Solution {
/**
利用递减栈，创建一个index栈，栈中存的是元素在T中的下标。
遍历T，若栈顶元素小于当前遍历到的元素，计算当前元素下标与栈顶元素（是个下标）的差值即为下标为栈顶元素的温度的未来升高天数，注意这里是循环判断，直到当前元素的值大于以栈顶元素为下标的值；当下标为栈顶元素的元素大于当前遍历到的元素时，将当前元素的下标入栈即可。T遍历完毕，栈中存留的下标对应的元素所对应的天数都为0（已初始化过）。
**/
    public int[] dailyTemperatures(int[] T) {
    	int[]days=new int[T.length];
    	Stack<Integer>index=new Stack<>();
    	for(int i=0;i<T.length;i++){
    		while(!index.empty()&&T[i]>T[index.peek()]){
    			days[index.peek()]=i-index.peek();
    			index.pop();
    		}
    		index.push(i);
    	}
     	return days;   
    }
}