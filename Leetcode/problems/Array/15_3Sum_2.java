class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len=nums.length;
        //if(len<3) return null;
        List<List<Integer>> allList=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<len-2;i++){     
            int left=i+1;
            int right=len-1;
            while(left<right){              
                int sum=nums[i]+nums[left]+nums[right];           
                if(sum==0)
                {
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]); 
                    allList.add(list);
                    //过滤相同的数字
                     while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }else
                    if(sum<0) left++;
                    else right--;  
           
            }
            while(i<len-2 && nums[i]==nums[i+1]) i++;//过滤相同的数字
            
        }
        return allList;
    }
}