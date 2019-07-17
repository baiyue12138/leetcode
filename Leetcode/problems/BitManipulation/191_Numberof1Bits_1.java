public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       // 在Java中，不存在无符号数，考虑使用按位与并无符号移位的方法.
        int sum =0;
        while(n != 0){
            sum += (n & 1);
            n >>>= 1;
        }
        return sum;
    }
}