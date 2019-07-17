class Solution {
/**
通过Stack、HashMap解决
先遍历大数组nums2，首先将第一个元素入栈；
继续遍历，当当前元素小于栈顶元素时，继续将它入栈；当当前元素大于栈顶元素时，栈顶元素出栈，此时应将该出栈的元素与当前元素形成key-value键值对，存入HashMap中；
当遍历完nums2后，得到nums2中元素所对应的下一个更大元素的hash表；
遍历nums1的元素在hashMap中去查找‘下一个更大元素’，当找不到时则为-1。
**/
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	Stack<Integer>s=new Stack();
    	Map<Integer,Integer>m=new HashMap<>();
    	int[]res=new int[nums1.length];
    	if(nums2.length>0) s.push(nums2[0]);
    	for(int i=1;i<nums2.length;i++){
    		while(!s.isEmpty() && s.peek()<nums2[i]){
                m.put(s.pop(), nums2[i]);
            }	
    		s.push(nums2[i]);
    	}
    	for(int i=0;i<nums1.length;i++){
    		res[i]=m.getOrDefault(nums1[i],-1);
    	}
     return res;   
    }
}