class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        int index = 0;
        for(int i = 0; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(solveit(board,i,j,used,word,index)){
                    return true;
                }
            }
        }
        return false;

    }
    public boolean solveit(char[][]board,int row , int col , boolean[][] used,String word,int index){
            if( row<0 || row >=board.length|| col<0 || col>=board[0].length || used[row][col]){
                return false;
            }
             if(word.charAt(index)!=board[row][col]){
                return false;
            }
            if(index == word.length()-1){
                return true;
            }
           
            used[row][col]= true;

            if(solveit(board,row-1,col,used,word,index+1)){
                    return true;
            }
            if(solveit(board,row+1,col,used,word,index+1)){
                    return true;
            }
            if(solveit(board,row,col+1,used,word,index+1)){
                    return true;
            }
            if(solveit(board,row,col-1,used,word,index+1)){
                    return true;
            }
            used[row][col]= false;

            return false;

    }
}