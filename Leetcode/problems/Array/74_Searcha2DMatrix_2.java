class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      	  for(int i=0;i<matrix.length;i++){
      	  	if(search(matrix[i],target)){
      	  		return true;
      	  	}
      	  }
      	  return false;
    }
    boolean search(int[]a,int t){
    	int l=0,r=a.length-1;
    	while(l<=r){
    		int mid=(l+r)/2;
    		if(a[mid]==t){
    			return true;
    		}
    		if(a[mid]>t){
    			r=mid-1;
    		}
    		if(a[mid]<t){
    			l=mid+1;
    		}
    	}
    	return false;
    }
}
}