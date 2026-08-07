class Solution {
    public boolean rotateString(String s, String goal) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        if(s.length() != goal.length()){
            return false;
        }
        for(int i = 0 ; i<len ; i++){
            char stack = arr[0];
        for(int j = 0 ; j < len-1 ; j++){
            arr[j] = arr[j+1];
            }
            arr[len-1] = stack;
            String trial = new String(arr);
            if(trial.equals(goal) ){
                return true;
            }
        }
        return false;
    }
}