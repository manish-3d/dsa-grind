class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int row = matrix.length;
            int col = matrix[0].length;
            int j = 0;
            int k = col-1;
            
          while(k>=0 && j <row){
                int curr = matrix[j][k];
                if(curr > target){
                    k--;
                }else if (curr < target){
                    j++;
                }else if( curr == target){
                    return true;
                }

           }
           return false;
            
    }
}