class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length/2;
	        int result=0;
	        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
	        for (int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                map.put(nums[i],map.get(nums[i])+1);
	            }
	            else{
	                map.put(nums[i],1);
	            }
	        }
	        for(Integer key : map.keySet()){
	            if(map.get(key)>len){
	                result=key;
	                break;
	            }
	        }
	        return result;
    }
}