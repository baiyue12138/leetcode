class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
      Arrays.sort(nums);
        List<List<Integer>> ens=new ArrayList<>();
      do{
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
          list.add(num);
        }
        ens.add(list);
      }while(nextPermute(nums));
      return ens;
    }
    boolean nextPermute(int[] nums){
      int len=nums.length;
      for(int i=len-1;i>=0;i--){
        for(int j=len-1;j>i;j--){
          if(nums[i]<nums[j]){
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
            Arrays.sort(nums,i+1,len);
            return true;
          }
        }
      }
      Arrays.sort(nums);
      return false;
    }
}