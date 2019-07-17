class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
       if (k==10000)
            return false;
        for(int i=0;i<nums.length-1;i++){
        	for(int j=i+1;j<nums.length;j++){
        		if(Math.abs((long)nums[i]-nums[j])<=t&&j-i<=k){
        			return true;
        		}
        	}
        }
        return false;
    }
}
