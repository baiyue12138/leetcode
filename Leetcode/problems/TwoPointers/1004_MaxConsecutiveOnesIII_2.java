class Solution {
    public int longestOnes(int[] A, int K) {
    	/**
    	1.设置一个数组用来记录窗口中每个字符出现的个数（由于这里主要统计1的个数，所以不需要设置数组）；并且初始化为第一个字符的数量
    	2.设置一个左指针，
    	3.设置右指针遍历数组，从第2位置开始；
    	4.统计当前字符出现的次数，统计最多字符的次数，
    	5.如果窗口中出现最多字符（1的个数）的个数+k<right-left+1(窗口大小)则左指针右移，并减少个数A[left]这个字符出现的次数。
    	6.如果窗口中出现最多字符的个数+k>=right-left+1(窗口大小),则保存当前的最大值
    	**/
    	int sum1=A[0]==1?1:0;//记录窗口中1出现的个数
    	int left=0;//左指针
    	int len=sum1>0?1:0;//结果
    	for(int right=1;right<A.length;right++){
    		if(A[right]==1) sum1+=1;//统计当前字符出现的次数，也是最多字符的次数
    		if(sum1+K<right-left+1){
    			if(A[left]==1) sum1--;
    			left++;
    		}else{
    			len=Math.max(len,right-left+1);
    		}
    	} 
    	return len;
    }
}