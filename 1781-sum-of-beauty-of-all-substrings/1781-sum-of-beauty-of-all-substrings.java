class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0 ; i<s.length() ; i++){
         int[]freq = new int[26];
        for(int k = i ; k<s.length() ;k++){
         freq[s.charAt(k) - 'a']++;
            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j<26 ;j++){
                if(freq[j]>0){
                    min = Math.min(freq[j],min);
                    max = Math.max(freq[j],max);
                }
            }
            ans = ans + max-min;
        }
        }
        return ans;

    }
}