class Solution {
    public boolean isValidSudoku(char[][] board) {
       boolean[][]row=new boolean[9][9]; 
       boolean[][]col=new boolean[9][9]; 
       boolean[][]que=new boolean[9][9]; 
       for(int i=0;i<board.length;i++){
       		for(int j=0;j<board[0].length;j++){
       		if(board[i][j]!='.'){
       			int num=board[i][j]-'1';
       			int pos= i / 3 * 3 + j / 3;
       			if(row[i][num]==true||col[j][num]||que[pos][num]){
       				return false;
       			}else{
       				row[i][num]=true;
       				col[j][num]=true;
       				que[pos][num]=true;
       			}
       		}	
       		}
       }
       return true;
    }
}
