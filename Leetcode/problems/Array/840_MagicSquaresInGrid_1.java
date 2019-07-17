class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int sum=0;
        if(grid.length<3||grid[0].length<3) return 0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[i].length-2;j++){
                sum+=isMagic(i,j,grid);
            }
        }
        return sum;
    }
    int isMagic(int i,int j,int[][] grid){
       for(int k=i;k<i+3;k++){
            for(int g=j;g<j+3;g++){
                if(grid[k][g]<1||grid[k][g]>9) return 0;
            }
       }
                int row1=grid[i][j]+grid[i][j+1]+grid[i][j+2];
                int row2=grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
                int row3=grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                int col1=grid[i][j]+grid[i+1][j]+grid[i+2][j];
                int col2=grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1];
                int col3=grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2];
                int sla1=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
                int sla2=grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
                if(row1==row2&&row1==row3&&row1==col1&&row1==col2&&row1==col3&&row1==sla1&&row1==sla2)
                    return 1; 
        return 0;
    }
}