class Solution {
    public boolean isMonotonic(int[] A) {
        //if(isRise(A)||isDrop(A)) return true;
        return (isRise(A)||isDrop(A));
    }
    boolean isRise(int []A){
        for(int i=0;i<A.length-1;i++)
            if(A[i]>A[i+1])
                return false;
        return true;
    }
     boolean isDrop(int []A){
        for(int i=0;i<A.length-1;i++)
            if(A[i]<A[i+1])
                return false;
        return true;
    }
}