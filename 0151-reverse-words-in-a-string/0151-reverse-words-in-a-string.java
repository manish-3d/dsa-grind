class Solution {
    public String reverseWords(String s) {
       String[] ansar = s.trim().split("\\s+");
       StringBuilder sb = new StringBuilder();
       for(int i = ansar.length-1; i>=0 ; i--){
            sb.append(ansar[i]);
            if(i != 0){
                sb.append(" ");
            }
       }
       return sb.toString();
        
    }
}