class Solution {
  //从后往前找，找到第一对(i,j)，使得 nums[i] < num[j] ,然后将两者交换后，后面部分排序即可。
    public void nextPermutation(int[] nums) {
      int len=nums.length-1;
      int tem=0;
      for(int i=len;i>=0;i--){
        for(int j=len;j>i;j--){
          if(nums[i]<nums[j]){
            tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
            Arrays.sort(nums,i+1,len+1);
            return;
          }
        }
      }
      Arrays.sort(nums,0,len+1);  
    }
}