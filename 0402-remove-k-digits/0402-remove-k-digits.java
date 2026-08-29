class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(char ch : num.toCharArray()){
            int curr = ch - '0';
            while(!stack.isEmpty() && curr < stack.peek() && k > 0){
                stack.pop();
                k--;
            }
            stack.push(curr);
        }
        while(k > 0 ){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }
         int i = 0;
        while (i < sb.length() - 1 && sb.charAt(i) == '0') {
            i++;
        }
         if (sb.length() == 0) {
            return "0";
        }

        return sb.substring(i);

    }
}