class Solution {
//二分查找:确定分割条件，然后需要考虑访问哪个片段
/**如果中间的数小于最右边的数，则右半段是有序的，
若中间数大于最右边数，则左半段是有序的，
我们只要在有序的半段里用首尾两个数来判断目标值是否在这一区域内，这样就可以确定保留哪半边了，
**/
    public int search(int[] nums, int target) {
    	int len=nums.length;
        int l=0,r=len-1;
        while(l<=r){
        	int mid=(l+r)/2;
        	if(nums[mid]==target) return mid;
        	if(nums[mid]<nums[r]){//右半段有序
        		if(nums[mid]<target&&nums[r]>=target)
        			l=mid+1;
        		else{
        			r=mid-1;
        			}
        	}else{//左半段有序
        		if(nums[mid]>target&&nums[l]<=target)
        			r=mid-1;
        		else
        		{
        			l=mid+1;
        		}
        	}
        }
        return -1;
    }
}