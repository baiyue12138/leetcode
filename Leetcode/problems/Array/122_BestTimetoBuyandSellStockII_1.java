class Solution {
	/**
	这题的思路：
	1、用一个count，设初值为0
	2、扫一遍数组，让相邻的两个数相减
	3、若差值大于0，则加到count上去
	4、返回count，即求得最大利润
	**/
    public int maxProfit(int[] prices) {
        int count=0;
        for(int i=0;i<prices.length-1;i++){
        	int x=prices[i+1]-prices[i];
        	if(x>0) count+=x;
        }
        return count;
    }
}