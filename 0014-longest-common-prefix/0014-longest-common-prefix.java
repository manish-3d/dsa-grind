class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder strb = new StringBuilder("");
        char check1;
        String minStr = strs[0];

for (int i = 1; i < strs.length; i++) {
    if (strs[i].length() < minStr.length()) {
        minStr = strs[i];
    }
}
        for(int i = 0 ; i < minStr.length(); i++){
            int count =0;
            for(int j = 0 ; j<strs.length; j++){
                check1 = minStr.charAt(i);
                if(check1 == strs[j].charAt(i)){
                    count++;
                }
                if(check1 != strs[j].charAt(i)){
                    return strb.toString();
                }
                if(count == strs.length){
                    strb.append(minStr.charAt(i));
                }
            }
        }
       String returnstr = strb.toString();
       return returnstr;
       
    }
}