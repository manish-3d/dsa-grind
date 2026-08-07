class Solution {
   public boolean ispallindrome(String s, int low, int high) {
    while (low < high) {
        if (s.charAt(low) != s.charAt(high))
            return false;
        low++;
        high--;
    }
    return true;
}
    public boolean validPalindrome(String s) {
        int low = 0 ; 
        int high = s.length()-1;
        while(low < high ){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }else{
                return ispallindrome(s,low+1,high) || ispallindrome(s,low,high-1);
            }
        }
        return true;
    }
}