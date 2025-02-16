class Solution {
    private boolean isValid(int row,int col,char[][] board){
        char ch=board[row][col];
        for( int i=0;i<9;i++){
            if(i!=col && board[row][i]==ch) return false;
            if(i!=row && board[i][col]==ch) return false;
            int x=3*(row/3)+(i/3);
            int y=3*(col/3)+(i%3);
            if(((x!=row) || y!=col) && (board[x][y]==ch)) return false;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]!='.'){
                   if(!isValid(row,col,board)){
                        return false;
                   }
                }
            }
        }
        return true;
    }
   
}
