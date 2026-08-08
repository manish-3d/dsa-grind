class Solution {
    public int[] expand(String s , int i , int j){
        int[]ans = new int[2];
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
                i--;
                j++;
        }
        ans[0]=i+1;
        ans[1]=j-1;
        return ans ;
    }
    public String longestPalindrome(String s) {
        int maxlen = 0;
        String ans = "";
        for(int i = 0 ; i<s.length() ; i++){
            int[] len1 = expand(s,i,i);
            int[] len2 = expand(s,i,i+1);
           if(len1[1]-len1[0]+1 > len2[1]-len2[0]+1){
            if(len1[1]-len1[0]+1>maxlen){
                maxlen = len1[1]-len1[0]+1;
                ans = s.substring(len1[0],len1[1]+1);
            }
            }else{
            if(len2[1]-len2[0]+1>maxlen){
                maxlen = len2[1]-len2[0]+1;
                ans = s.substring(len2[0],len2[1]+1);
            }
            }   
        }
        return ans;
    }

}