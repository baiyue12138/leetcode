class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0||(dividend==Integer.MIN_VALUE&&divisor==-1)) return Integer.MAX_VALUE;
        long m=Math.abs((long)dividend);
        long n=Math.abs((long)divisor);
        int sign=(dividend>0) ^ (divisor>0) ? -1:1;
        int res=0;
        while(m>=n){
        	long t=n,p=1;
        	while(m>=(t<<1)){
        		p<<=1;
        		t<<=1;
        	}
        res+=p;
        m-=t;
        }
        return sign == 1 ? res : -res;
    }
}