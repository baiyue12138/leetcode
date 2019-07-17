class Solution {
/**
思路：旋转之后，比较大的在前面，较小的在后面，所以以最后一个数（key）为基准来更新l，r
二分查找一定先明确，l,r,key，条件
**/
    public int findMin(int[] nums) {
    	int len=nums.length;
       if(len==1) return nums[0];
       if(nums[0]<nums[len-1]) return nums[0];
       int l=0, r=len-1;
       while(l<r){
       	int mid=(l+r)/2;
       	if(nums[mid]>nums[r]){
       		l=mid+1;
       	}else{
       		r=mid;
       	}
       }
       return nums[l];
    }
}