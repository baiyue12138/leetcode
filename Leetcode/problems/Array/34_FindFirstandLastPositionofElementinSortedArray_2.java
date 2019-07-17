class Solution {
  //折半查找，利用其升序的性质
    public int[] searchRange(int[] nums, int target) {
      int[]res={-1,-1};
      int left=0;
      int right=nums.length-1;
      while(left<=right){
        int mid=(left+right)/2;
        if(nums[mid]==target){
         int i=mid;
         int j=mid;
          while(i>0&&nums[i-1]==target) i--;
          while(j<nums.length-1&&nums[j+1]==target) j++;
          res[0]=i;
          res[1]=j;
          break;
        }else{
          if(nums[mid]>target)
          {
            right=mid-1;
          }else{
           left=mid+1;
          }
        }
      }
      return res;
    }
}
