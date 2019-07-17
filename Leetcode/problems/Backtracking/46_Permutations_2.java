class Solution {
    //需要借助下一个排列函数
    public List<List<Integer>> permute(int[] nums) {
      //先对nums进行排序，使其为最小值
      Arrays.sort(nums);
      List<List<Integer>> AllList=new ArrayList<>();
     
      do{
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
          list.add(nums[i]);
        }
        AllList.add(list);
      }while(nextPermute(nums));  
      return AllList;
    }
  
    boolean nextPermute(int[] nums){
      int len=nums.length;
      for(int i=len-1;i>=0;i--){
        for(int j=len-1;j>i;j--){
          if(nums[i]<nums[j])
          {
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
            Arrays.sort(nums,i+1,len);
            return true;
          }
        }
      }
      Arrays.sort(nums,0,len);
      return false;
    }
}