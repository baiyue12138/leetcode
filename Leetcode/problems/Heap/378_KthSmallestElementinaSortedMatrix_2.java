class Solution {
    public int kthSmallest(int[][] matrix, int k) {
   	 	int m=matrix.length;
    	int n=matrix[0].length;
    	if(matrix==null||m<=0||n<=0){
    		return 0;
    	}
        int[] nums=new int[m*n];
        int K=0;
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		nums[K]=matrix[i][j];
            K++;
        	}
        }
        Arrays.sort(nums);
        return nums[k-1];
    }
}