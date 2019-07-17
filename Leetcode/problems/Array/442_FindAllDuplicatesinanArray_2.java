class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        	int index=Math.abs(nums[i])-1;
        	if(nums[index]>0){//出现一次
        		nums[index]=-nums[index];
        	}else{//表示已经出现过一次，这是第二次
        		list.add(index+1);
        	}
        }
        return list;  
    }
}