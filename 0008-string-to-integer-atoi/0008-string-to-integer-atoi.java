class Solution {
    public int myAtoi(String s) {
        int i = 0;
        while(i<s.length() &&s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if(i<s.length() && (s.charAt(i) == '-' || s.charAt(i)== '+')){
            sign = s.charAt(i) == '-' ? -1 : 1 ;
            i++;
        }
        Long num = 0L;
        return solveit(s,num,i,sign);
    }
    public int solveit(String s , Long num , int i , int sign ){
        //base case 
        if(i== s.length() || !Character.isDigit(s.charAt(i))){
            if(num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            return (int)(num*sign);
        }
        num = num*10 + (s.charAt(i)-'0');
        Long num1 = num*sign;
        if(num1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(num1 > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return solveit(s,num,i+1,sign);
    }
}