class Solution {
    public int minSubArrayLen(int s, int[] nums) {
    /**
    [1,2,3,4,5,6,7] s=9,对于数组来说，要求O（n)的一般都可以用双指针解决，一个指针是这个字串的开始位置，另一个指针用于遍历数组
    **/
    int minlen=Integer.MAX_VALUE;
    int start=0;
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    	if(sum>=s){
    		minlen=Math.min(minlen,i-start+1);
    		i=start;
        start++;
    		sum=0;
    	}
    }
    return minlen<Integer.MAX_VALUE?minlen:0;
        
    }
}