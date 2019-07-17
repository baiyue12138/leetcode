class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen=0;
        int len=0;
        if (nums.length==1&& nums[0]==1) return 1;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1) 
            {
               len+=1;
                if (i==nums.length-1&& len>=maxlen)
                {
                    maxlen=len;
                }
            }
            else{
                if (len>=maxlen) 
                {maxlen=len;
                }
                len=0;
            }
        }
        return maxlen;
    }
}