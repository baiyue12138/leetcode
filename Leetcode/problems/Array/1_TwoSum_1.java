class TwoSum {
   public int[] twoSum(int[] nums, int target) {
        int []res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;                    
                }
            }
        }
        return res;
    }
}


class TwoSum {
   public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {//当map中有值需要当前值时，说明找到结果。
                return new int[]{hashMap.get(nums[i]), i};
            }
            hashMap.put(target - nums[i], i);
            //存入当前值所需要的数值，比如target为5，当前值为1，他需要4，才能得到目标值。
        }
        return null;
    }
}