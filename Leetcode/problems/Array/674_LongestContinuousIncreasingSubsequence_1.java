class Solution {
//这也可以看成求连续序列长度的问题，所以设置双指针，长度=start-end
//遇到nums[i+1]<=nums[i] 的时候就计算长度，更新最大长度 并更新start=i;
    public int findLengthOfLCIS(int[] nums) {
      if(nums.length==0) return 0;
        int max=0;
        int start=0;
        int end=1;
        for(;end<nums.length;end++){
        	if(nums[end]<=nums[end-1]){
        		max=Math.max(max,end-start);
        		start=end;
        	}
        }
       max=Math.max(max,end-start);
        return max;
    }
}