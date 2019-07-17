class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average;
        double maxaverage=0;
        double sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (i==k-1){
                average=sum/k;
                maxaverage=average;
            }
            if(i>=k){
                sum=sum-nums[i-k];
                average=sum/k;
                if(average>=maxaverage)
                {
                     maxaverage=average;
                }
                   
            }
        }
        return maxaverage;
    }
}