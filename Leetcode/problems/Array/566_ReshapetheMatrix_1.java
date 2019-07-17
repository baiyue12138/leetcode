class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r*c!=nums.length*nums[0].length) return nums;
        int[][] newNums=new int[r][c];
        int[] nums2=new int[r*c];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for( int j=0;j<nums[i].length;j++){
                nums2[k]=nums[i][j];
                k++;
            }
        }
        k=0;
        for(int i=0;i<r;i++){
            for( int j=0;j<c;j++){
               newNums[i][j]=nums2[k]; 
                k++;
            }
        }
        return newNums;
    }
}