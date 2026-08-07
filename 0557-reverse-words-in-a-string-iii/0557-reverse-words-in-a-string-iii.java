class Solution {
    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        StringBuilder fans = new StringBuilder();
        int i = 0;
        for(String str : ans){
            ans[i] = new StringBuilder(str).reverse().toString();
            fans.append(ans[i]);
            if(i!= ans.length-1){
                fans.append(" ");
            }
            i++;
        }
    return fans.toString();
    }
}