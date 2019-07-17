class Solution {
//https://blog.csdn.net/tomwillow/article/details/86558665
    public int subarraysDivByK(int[] A, int K) {
        // 计算前缀和
        int[] preSum = new int[A.length + 1];
        for (int i = 1; i <= A.length; i++)
            preSum[i] = preSum[i - 1] + A[i - 1];
        //前缀和的余数
        int[]cout=new int[K];
        for(int sum:preSum){
        	int num=(sum%K+K)%K;
        	cout[num]++;
        }
        // 计算最终结果
        int ans = 0;
        for (int i = 0; i < K; i++) {
            ans += cout[i] * (cout[i] - 1) / 2; // 计算余数相同的结果
        }
        
        return ans;
    }
}