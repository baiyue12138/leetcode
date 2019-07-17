class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int len=A.length;
        int []B=new int[len];
        int k=0,g=1;
        for(int i=0;i<len;i++){
            if(A[i]%2==0)
            {
                B[k]=A[i];
                k+=2;
            }else{
                B[g]=A[i];
                g+=2; 
            }
        }
        return B;
    }
}