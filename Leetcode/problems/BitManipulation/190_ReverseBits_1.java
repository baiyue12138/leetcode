public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int sum=0;
       int i=0;
        while(i<32){
            int tem=n&1;
            n=n>>1;
            sum=(sum<<1)|tem;
            i++;
        }
        return sum; 
    }
}