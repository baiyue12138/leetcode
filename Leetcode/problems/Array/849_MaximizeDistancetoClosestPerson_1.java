class Solution {
    /*
    最远距离 = （0 的个数+1）/ 2 
而 0 的个数 = 当前 1 的位置 - 上一个 1 的位置 - 1 
所以 最远距离 = （当前 1 的位置（i）- 上一个 1 的位置（flag））/ 2

考虑 0 开头和 0 结尾的特殊情况： 
0 的个数就是最远距离（只有一边有人）
    */
    public int maxDistToClosest(int[] seats) {
        int max = 0;
        int flag = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (flag == -1)
                    max = i;
                else
                    max = Integer.max((i - flag) / 2, max);
                flag = i;
            }
        }
        return Integer.max( seats.length - flag - 1,max);
    }
}