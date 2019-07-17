class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3) return false;
        int maxLoca=-1;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1]) maxLoca=i+1;
        }
        if(maxLoca<=0||maxLoca>=A.length-1) return false;
        for(int i=0;i<maxLoca;i++){
            if(A[i]>=A[i+1]) 
                return false;
        }
        for(int i=maxLoca;i<A.length-1;i++){
            if(A[i]<=A[i+1]) 
                return false;
        }
        return true;
    }
}