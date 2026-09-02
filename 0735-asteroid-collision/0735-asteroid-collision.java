class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int cnt = 0;
        for(int i = 0 ; i<asteroids.length ; i++){
            int curr = asteroids[i];
            if(!stack.isEmpty() &&(stack.peek() > 0 && curr <0 )){
                if((Math.abs(stack.peek()) < Math.abs(curr))){
                while (!stack.isEmpty()  && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(curr)) {
    stack.pop();
}
                }if (!stack.isEmpty()
                        && stack.peek() > 0
                        && Math.abs(stack.peek()) == Math.abs(curr)) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(curr);
                }
            }else{
                stack.push(curr);
            }
            
        }cnt = stack.size();
        int[] ans = new int[stack.size()];
        for(int i = 0 ; i<cnt ; i++){
            ans[i] = stack.pollLast();
        }
        return ans ;
    }
}