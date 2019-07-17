class Solution {
    public int countPrimes(int n) {
    //厄拉多塞筛法 :用一个数组表示该位置上的数是否是质数，从2开始，如果是质数，就将他前面所有该质数的倍数的数的位置都标记为非质数。
        if(n<2) return 0;
        boolean[]flag=new boolean[n];
        int res=0;
        for(int i=2;i<n;i++){
        	if(flag[i]==false){//质数/素数
        		res++;
        		for(int j=2;j*i<n;j++){
        			flag[j*i]=true;
        		}
        	}
        }
        return res;
    }
}