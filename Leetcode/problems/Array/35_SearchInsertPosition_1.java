class Solution {
    public int searchInsert(int[] nums, int target) {
        int re=0;
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                re=i;
                break;
            }
        }
        if(nums[nums.length-1]<target){
            re=nums.length;
        }
        return re;
    }
}