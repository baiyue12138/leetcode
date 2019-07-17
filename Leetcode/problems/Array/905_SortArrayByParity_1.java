class Solution {
    public int[] sortArrayByParity(int[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0){
                int j=i+1;
                for(;j<A.length;j++)
                    if(A[j]%2==0)
                    {
                       A[i]=A[i]+A[j];
                        A[j]=A[i]-A[j];
                        A[i]=A[i]-A[j];
                        break;
                    }
                if(j>=A.length) return A;
            }
        }
        return A;
    }
}