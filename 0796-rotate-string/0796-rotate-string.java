class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i<sb.length() ; i++){
           if(!sb.toString().equals(goal)){ 
            char ch = sb.charAt(0);
            sb.append(ch);
            sb.deleteCharAt(0);
           }else if(sb.toString().equals(goal)){
            return true;
           }
        }
        return false;
    }
}
