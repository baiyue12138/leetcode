class Solution {
   public int numSubarraysWithSum(int[] A, int S) {
        //和相同的二元子数组个数
        int result=0;
        for(int i=0;i<A.length;i++){
            int total=0;
            for(int j=i;j<A.length;j++){
                total+=A[j];
                if(total==S){//判断累加后的值是否为期待值，若是则子数组个数自增
                    ++result;
                }
                if(total>S){//大于期待值直接中断循环
                    break;
                }
            }
        }
        return result;
    }
}