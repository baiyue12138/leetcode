class Solution {
/**
由于给定的数组全是正数，直接用数组中对应位置的数作为索引将对应索引的数变成相反数来表示有没有出现过该数，同时取索引的时候加一个绝对值，这样就不会丢失原数组中的数据啦，不然你把对应位置都置1了，那么这个位置的数就丢了啊
**/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        	int index=Math.abs(nums[i])-1;
        	if(nums[index]>0){
        		nums[index]=-nums[index];
        	}
        }
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>0){
        		list.add(i+1);
        	}
        }
        return list;
    }
}