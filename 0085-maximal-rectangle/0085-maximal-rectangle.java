class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int max = 0;
        int[] nums = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '0') {
                    nums[j] = 0;
                } else {
                    nums[j]++;
                }
            }

            Deque<Integer> stack = new ArrayDeque<>();

            for (int k = 0; k <= cols; k++) {
                int curr = k < cols ? nums[k] : 0;

                while (!stack.isEmpty() && nums[stack.peek()] > curr) {
                    int index = stack.pop();
                    int height = nums[index];

                    int left = stack.isEmpty() ? -1 : stack.peek();
                    int width = k - left - 1;

                    max = Math.max(max, height * width);
                }

                stack.push(k);
            }
        }

        return max;
    }
}