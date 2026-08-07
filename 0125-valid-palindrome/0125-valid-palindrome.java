class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        String [] sans = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<sans.length ; i++){
            sb.append(sans[i]);
        }
        for(int i = 0; i<sb.length() ; i++){
            if(!Character.isLetterOrDigit(sb.charAt(i))){
            sb.deleteCharAt(i);
            i--;
        }
        }


       if( sb.toString().equals(sb.reverse().toString())){
        return true;
       }return false;


    }
}