class Solution {
    public List<String> generateParenthesis(int n) {
        int  balance = 0;
        int open = 0;
        String  substr = "";
        List<String> ans = new ArrayList<>();
        generator(n,balance,open,substr,ans);
        return ans;
    }
    public void generator(int n , int balance ,int  open , String substr , List<String> ans){
        //base case 
        if(open == n && balance == 0 ){
            ans.add(substr);
            return ;
        }
        
        if(open < n ){
       generator(n,balance+1,open+1,substr+"(",ans);
        }
       if(balance > 0){
         generator(n,balance-1,open , substr+")",ans);
        }
       
    }
}