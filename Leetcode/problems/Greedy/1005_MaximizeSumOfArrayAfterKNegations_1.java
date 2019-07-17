class Solution {
//思路：先排序，然后将所有的负数改变符号,如果剩余的k的值为奇数，则改变最小元素的符号
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int i=0;
        int sum=0;
        for(;i<A.length;i++){
        	if(A[i]<0&&K>0){
        		A[i]=-A[i];
        		K--;
        	}
        }
        Arrays.sort(A);
        if(K%2!=0) A[0]=-A[0];
        for(i=0;i<A.length;i++){
        	sum+=A[i];
        }
        return sum;
    }
}