class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len=nums.length;
        Arrays.sort(nums);
        int diff=0;
        for(int i=0;i<len-3;i++){
            int left=i+1;
            int right=len-1;
            while(left<right){
                diff=target-nums[i]+nums[left]+nums[right];
                if(diff<=nums)
            }
        }
        
    }
}