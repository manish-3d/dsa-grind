class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temp.length];
        for(int i = 0; i<temp.length ; i++){
            if(stack.isEmpty() || temp[stack.peek()] >= temp[i]){
                stack.push(i);
            }else if (temp[stack.peek()] < temp[i]){
                while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                    int index = stack.pop();
                    ans[index] = i - index;
                }
                stack.push(i);
            }
        }
        return ans ;
    }
}