class Solution {
/**
设置双指针，end指向无重复数字数组的结束位置，i遍历原数组
**/
    public int removeDuplicates(int[] nums) {
        int end=0;
        int count=0;//用来计数
        for(int i=1;i<nums.length;i++){
        	if(nums[i]==nums[end]){
        		count++;
        		if(count<2){
        			nums[++end]=nums[i];
        		}
        	}else{
        		nums[++end]=nums[i];
        		count=0;
        	}
        }
        return end+1;
    }
}