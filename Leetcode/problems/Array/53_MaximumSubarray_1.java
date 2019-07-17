class Solution {
  //分治算法
    public int maxSubArray(int[] nums) {
      return subSum3(nums, 0, nums.length - 1);
    }
  /**
     * 解题思路：在一个数组中要找到最大连续子序列和，这个和要么出现在左半部分，要么出先在右半部分
     *          要么出现在横跨两部分之间
     * 时间复杂度:O(NlogN)
     * 这个算法就有一定的实用价值，虽然在效率上还是逊色于线性复杂度的算法
     思路：假设数组下标有效范围是l到r,将数组分为左半部分下标为（l，mid-1）和右半部分下标为(mid+1，r)以及中间元素下标为mid，接下来递归求出左半部分的最大子序和：left=helper(nums,l,mid-1); 右半部分最大子序和right=helper(nums,mid+1,r);

接下来再将左半部分右边界，右半部分左边界以及中间元素nums[mid]整合，用了两个循环，先整合左半部分右边界和中间值，再将整合结果与右半部分左边界整合得到整合以后的最大子序和max_num，最后返回max_num，left,right的最大值即是要求的最大子序和。
     */
    private int subSum3(int[] nums, int left, int right) {
      if(left>right) return Integer.MIN_VALUE;
      /*
      https://blog.csdn.net/weixin_42130471/article/details/81037849
      */
        if (left == right) return nums[left];
        int mid = (left + right) / 2;
        int maxLeftSum = subSum3(nums, left, mid);
        int maxRightSum = subSum3(nums, mid + 1, right);
        int t=nums[mid];
        int max_num=nums[mid];
        for(int i=mid-1;i>=left;i--){
            t+=nums[i];
            max_num=Math.max(max_num,t);
        }
        t=max_num;
        for(int i=mid+1;i<=right;i++){
            t+=nums[i];
            max_num=Math.max(max_num,t);
        }
        return Math.max(Math.max(maxLeftSum,maxRightSum),max_num);
    }
}