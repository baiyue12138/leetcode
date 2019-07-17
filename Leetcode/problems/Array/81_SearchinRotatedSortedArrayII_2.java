class Solution {
    public boolean search(int[] nums, int target) {
    	int len=nums.length;
        int l=0,r=len-1;
        while(l<=r){
        	int mid=(l+r)/2;
        	if(nums[mid]==target) return true;
        	if(nums[mid]<nums[r]){//右半段有序
        		if(nums[mid]<target&&nums[r]>=target)
        			l=mid+1;
        		else{
        			r=mid-1;
        			}
        	}
        	if(r>0&&nums[mid]==nums[r]){
        		r--;
        	}
        	if(nums[mid]>nums[l]){//左半段有序
        		if(nums[mid]>target&&nums[l]<=target)
        			r=mid-1;
        		else
        		{
        			l=mid+1;
        		}
        	}
        	if(l<len&&nums[mid]==nums[l]){
        		l++;
        	}
        }
        return false;
    }
}