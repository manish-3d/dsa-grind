class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int high = tokens.length - 1;
        int score = 0;
        int low = 0;
        while(low<=high){
            if(tokens[low] <= power){
                score++;
                power = power - tokens[low];
            }else if (tokens[low] > power){
                if(score >0 && low != high){
                    power = power + tokens[high] ;
                    high--;
                    score--;
                    low--;
                }else{
                    return score;
                }
            }
        low++;
        }
        return score;
    }
}