class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[]C=new int[2];
        int sumA=0;
        int sumB=0;
        int sizeA=A.length;
        int sizeB=B.length;
        for(int i=0;i<sizeA;i++){
            sumA+=A[i];
        }
        for(int i=0;i<sizeB;i++){
            sumB+=B[i];
        }
        int d=(sumA-sumB)/2;
        for(int i=0;i<sizeA;i++){
            for(int j=0;j<sizeB;j++){
                if((A[i]-B[j])==d)
                {
                    C[0]=A[i];
                    C[1]=B[j];
                    return C;
                }
            }
        }
        return null;     
    }
}