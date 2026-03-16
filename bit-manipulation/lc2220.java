

class Solution {
    public int minBitFlips(int start, int goal) {
       int ans = start^goal;
       int temp = ans ;
       int count = 0;
       int result = 0;
       while(ans != 0){
        if((temp & (1<< count)) != 0){
            result++;
        }
        count++;
        ans = ans>>1;
       }
       return result;
    }
}