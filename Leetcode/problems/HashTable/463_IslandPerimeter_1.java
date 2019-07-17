class Solution {
    public int islandPerimeter(int[][] grid) {
    //重点关注前面遍历过得方格，如果之前有相邻方格，就-2;
        int sum=0;
        int w=grid[0].length;
        int h=grid.length;
        for(int i=0;i<h;i++){
        	for(int j=0;j<w;j++){
        		if(grid[i][j]==1){
        			sum+=4;
        			if(j>0&&grid[i][j-1]==1) sum-=2;//左边是1的时候将中间两条边去掉
        			if(i>0&&grid[i-1][j]==1) sum-=2;//上边是1的时候将中间两条边去掉
        		}
        	}
        }
        return sum;
    }
}