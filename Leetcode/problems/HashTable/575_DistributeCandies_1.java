class Solution {
    public int distributeCandies(int[] candies) {
        //思路就是统计种类个数，如果种类数大于数组长度的一半，则最多种类数就是一半，否则就是种类数
        int len =candies.length;
        int max=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:candies){
        	if(!map.containsKey(i)){
        		map.put(i,1);
        	}
        }
        return map.size()>len/2?len/2:map.size();
    }
}