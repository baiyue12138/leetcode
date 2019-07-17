class Solution {
    public int findLHS(int[] nums) {
        if(nums == null || nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int preLength = 0;
        int curLength = 1;
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] == nums[i]){
                curLength++;   
            }
            else if(nums[i + 1] == nums[i] + 1){
                preLength = curLength;
                curLength = 1;
            }
            else{
                preLength = 0;
                curLength = 1;
            }
            if(preLength != 0 && curLength + preLength > max){
                max = curLength + preLength;
            }
        }
        return max;
    }
}