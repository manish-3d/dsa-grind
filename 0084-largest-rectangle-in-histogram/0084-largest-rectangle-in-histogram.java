class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxa = 0;
        for(int i = 0 ; i<=heights.length ; i++){
            int curr = i<heights.length ? heights[i] : 0;
        while(!stack.isEmpty() && curr < heights[stack.peek()]){
            int index = stack.pop();
            int elem = heights[index];
            int leftside = stack.isEmpty() ? -1 : stack.peek();
            int fetch = i - leftside - 1;
            maxa = Math.max(maxa , elem*fetch );
        }
        stack.push(i);
    }
    return maxa;
    }
}