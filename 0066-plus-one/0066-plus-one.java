class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int count = 0;
        for(int high = digits.length - 1; high>= 0 ; high--){
                digits[high] = digits[high] + carry ;
                if(digits[high]%10 == 0){
                    carry = 1;
                    digits[high]= 0;
                    count++;
                }else{
                    break;
                }
        }
        if(count != digits.length){
            return digits ;
        }else if(count == digits.length){
            int[]ans = new int[digits.length + 1];
         for(int i = 0 ; i<ans.length  ; i++){
              if(i == 0){
                ans[i] = 1;
              }else{
                ans[i]=0;
              }
            }
            return ans;
        }
       return digits;
    }
}