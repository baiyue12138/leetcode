class Solution {
    public String getPermutation(int n, int k) {
      if(n<=0) return "";
      String s="";
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
          nums[i]=i+1;
        }
      for(int i=1;i<k;i++){
        nextPermute(nums);
      }
      for(int i=0;i<n;i++){
         s+=nums[i];
        }
      return s;
    }
    void nextPermute(int[]nums){
      int len=nums.length;
      for(int i=len-1;i>=0;i--){
        for(int j=len-1;j>i;j--){
          if(nums[i]<nums[j]){
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
            Arrays.sort(nums,i+1,len);
            return;
          }
        }
      }
      Arrays.sort(nums);
    }
}