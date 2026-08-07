class Solution {
    public String largestOddNumber(String num) {
       int max = -1;
       for(int i = 0 ; i<num.length() ; i++){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))% 2 !=0){
                max = i;
            }
       }
       return num.substring(0,max+1);
    }
}
