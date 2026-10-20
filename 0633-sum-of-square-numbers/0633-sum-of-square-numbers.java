class Solution {
    public boolean judgeSquareSum(int c) {
       int  low = 0;
       int  high = (int)Math.sqrt(c);

        while(high>=low){
         long sum = (long)low*low + (long)high*high ;
         if(sum == c){
            return true;
         }else if(sum < c){
            low++;
         }else if(sum > c){
            high--;
         }
        }
        return false;
    }
}