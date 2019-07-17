class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int []res=new int[len];
        for(int i=0;i<len;i++){
        	int step=0;
        	int k=i;
        	while(step<len){
        		if(nums[k%len]>nums[i]){
        			res[i]=nums[k%len];
        			break;
        		}
        		k++;
        		step++;
        	}
        	if(step==len) res[i]=-1;
        }
       return res;
    }
}