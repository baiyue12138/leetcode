class Solution {
    //仔细观察，要求对角线相等，对角线的开端位于第一行和第一列，所以不需考虑第一行和第一列，其余位置只需要等于左上角元素即可
    //进阶的话每次只能读一行，维护一个数组每次保留上一行元素             //https://blog.csdn.net/liyuanyue2017/article/details/81163747
    public boolean isToeplitzMatrix(int[][] matrix) {
        int[]tem=matrix[0];
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]!=tem[j-1])
                    return false;                
            }
            tem=matrix[i];
        }
        return true;
    }
}