class Solution {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int second = Integer.MIN_VALUE;
        for(int i =nums.length-1 ; i>=0 ; i--){
            int curr = nums[i];
            while(!stack.isEmpty() && curr > stack.peek()){
                second = stack.pop(); 
            }if(curr < second){
                return true;
            }
            stack.push(curr);
        }
        return false;
    }
}