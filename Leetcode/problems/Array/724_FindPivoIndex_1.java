class Solution {
    public int pivotIndex(int[] nums) {
    	int rsum=0;
    	for(int i=0;i<nums.length;i++){
    		rsum+=nums[i];
    	}
    	int pos=-1;
    	int lsum=0;
    	for(int i=0;i<nums.length;i++){
    		rsum-=nums[i];
    		if(lsum==rsum){
    			pos=i;
    			break;
    		}
    		lsum+=nums[i];
    	}
     return pos;  
    }
}