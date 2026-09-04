class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int left = 0;
        int right =0;
        for(int  i=0; i<f.length ; i++){
            if(n==0){
                return true;
            }
            if(i == 0){
                left = 0;
            }else{
                left = f[i-1];
            }
            if(i ==f.length-1){
                right = 0;
            }else{
                right = f[i+1];
            }
            if(left == 0 && right == 0 && f[i] == 0){
                f[i] = 1;
                n--;
            }
            if(n==0){
                return true;
            }
            
        }
        return false;
    }
}