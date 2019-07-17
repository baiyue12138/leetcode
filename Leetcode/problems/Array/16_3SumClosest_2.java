class Solution {
    /*
    方法就是先sort一下array，为啥要sort呢，因为要用到two pointers 来遍历找两数之和，只有在从小到大排序之后的结果上，才能根据情况移动left 和right。 当确定好了第一个数字后，就在剩下的array里找两数之和，在加上第一个数字，用这个temp_sum减去target 来得到temp_diff，如果temp_diff比之前的小，那么更新diff 和 closestSum。 利用two pointers 特性， 如果temp_sum 比target 小的话，说明我们需要更大的sum，所以要让left++以便得到更大的sum。 如果temp_sum 比target 大的话，我们就需要更小的sum。如果相等的话，直接return 就可以了。因为都相等了，那么差值就等于0，不会有差值再小的了。
    */
    public int threeSumClosest(int[] nums, int target) {
        int len=nums.length;
        if(len<3) return 0;
        Arrays.sort(nums);
        int minsum=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(minsum-target);
        for(int i=0;i<len-2;i++){
            int left=i+1;
            int right=len-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                int tem_diff=Math.abs(sum-target);
                if(diff>tem_diff){
                    minsum=sum;
                    diff=tem_diff;
                }
                if(sum<target) left++;
                else if(sum>target) right--;
                else return sum;
            }
            
        }
        return minsum;
    }
}