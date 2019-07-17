class Solution {
	//https://blog.csdn.net/qq_41864967/article/details/88075061
	//https://blog.csdn.net/weixin_38385524/article/details/80836103
	//数字有正有负，使用map记录 子数组累加sum（key）和 和出现的次数（value）
	//sum[i]-sum[j]=k
	//[28,54,7,-70,22,65,-6]
	//	j                  i
    public int subarraySum(int[] nums, int k) {
        int res=0;
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
        	sum+= nums[i];
        	if(map.containsKey(sum-k)){
        		res+=map.get(sum-k);
        	}
        	map.put(sum,map.getOrDefault(sum,0)+1);
        	}
      	return res;
        }       
    }