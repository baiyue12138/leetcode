class Solution {
//[3,2,1]
    public int findPeakElement(int[] nums) {
        int pos=0;
        int len=nums.length;
        if(len<=1) return 0;
        if(len==2) 
        {	pos=nums[0]>nums[1]?0:1;
       	 	return pos;
        }
        if(nums[0]>nums[1]) return 0;
        if(nums[len-1]>nums[len-2]) return len-1;
        int left=1,right=len-2;
        while(left<=right){
        	if(nums[left]>nums[left-1]&&nums[left]>nums[left+1]){
        		pos=left;
        		break;
        	}
        	if(nums[right]>nums[right-1]&&nums[right]>nums[right+1]){
        		pos=right;
        		break;
        	}
        	left++;
        	right--;
        }
        return pos;
    }
}