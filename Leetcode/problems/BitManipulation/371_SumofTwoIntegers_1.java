class Solution {
    public int getSum(int a, int b) {
        //https://blog.csdn.net/wilsonsong1024/article/details/79448136
        if((a&b)==0)
        return a|b;
        return getSum(a^b, (a&b)<<1);
    }
}