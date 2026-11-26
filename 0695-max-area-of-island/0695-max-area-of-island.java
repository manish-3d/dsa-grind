class Solution {
    int max;
    public int maxAreaOfIsland(int[][] grid) {
        max = Integer.MIN_VALUE;
        int row = grid.length ;
        int col = grid[0].length ;
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j < col ; j++){
                int k = 0;
                if(grid[i][j]==1){
                    k = dfs(grid,i,j,0);
                }
                max = Math.max(max,k);
            }
        }
        return max;
        }
    public int dfs(int[][] grid ,int row , int col ,int k){
        if(row < 0 || col < 0 || col >= grid[0].length || row >= grid.length || grid[row] [col] == 0){
            return 0;
        }
        
        grid[row][col] = 0;
        k = 1;
        k  += dfs(grid,row -1 ,col ,k);
        k  += dfs(grid,row +1,col ,k);
        k  += dfs(grid,row ,col-1,k);
        k  += dfs(grid,row,col + 1,k);
        return k;
    }
}