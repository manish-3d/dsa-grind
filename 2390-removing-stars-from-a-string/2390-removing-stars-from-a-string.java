class Solution {
    public String removeStars(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            if(Character.isAlphabetic(curr)){
                stack.push(i);
            }else{
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(s.charAt(stack.pollLast()));
        }
        return sb.toString();
    }
}