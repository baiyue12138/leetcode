class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int pos=0;
        int max=0;
        int len=A.length;
        if(len<=1) return 0;
        int left=1,right=len-1;
       	while(left<=right){
        	if(A[left]>max){
        		pos=left;
        		max=A[left];
        	}
        	if(A[right]>max){
        		pos=right;
        		max=A[right];
        	}
          left++;
        	right--;
        }
        return pos;
    }
}