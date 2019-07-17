class Solution {
//1.使用一个数组和一个指针来模拟栈
//2.if栈为空或者栈顶元素大于当前元素，就把当前元素的下标入栈
//3.while 栈不空并且栈顶元素小于当前元素。就出栈，更新与栈顶对应位置的元素
//4.把当前位置的元素的下标入栈
    public int[] nextLargerNodes(ListNode head) {
    	if(head==null) return null;
        Stack<Integer>stack=new Stack();
        List<Integer>list=new ArrayList();//用来存列表结果
        ListNode h=head;
        while(h!=null){
        	list.add(h.val);
        	h=h.next;
        }
        int cur=0;
        int[]tem=new int[list.size()];
        while(head!=null){
        	if(stack.isEmpty()||list.get(stack.peek())>=head.val){
        		stack.push(cur);
        	}else{
        		while(!stack.isEmpty()&&list.get(stack.peek())<head.val){
        			tem[stack.pop()]=head.val;
        		}
        		stack.push(cur);
        	}
        	head=head.next;
        	cur++;
        }
        
        return tem;
    }
}