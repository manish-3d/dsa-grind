class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row = image.length;
        int col = image[0].length;
        if (image[sr][sc] == color) {
        return image;
        }
        dfs(image[sr][sc],sr,sc,image,color);
        return image;
    }
    public void dfs(int don ,int row,int col , int[][] image, int color){
        if(row <0 || col <0 || row >= image.length || col >= image[0].length || image[row][col] != don ){
            return;
        }
        image[row][col] = color;
        dfs(don,row-1,col,image,color);
         dfs(don,row,col-1,image,color);
          dfs(don,row,col+1,image,color);
           dfs(don,row+1,col,image,color);
    }

}