import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {
        return sumOfMaximums(nums) - sumOfMinimums(nums);
    }

    private long sumOfMinimums(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
                int index = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long leftChoices = index - left;
                long rightChoices = right - index;

                sum += (long) nums[index] * leftChoices * rightChoices;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return sum;
    }

    private long sumOfMaximums(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] < nums[i])) {
                int index = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long leftChoices = index - left;
                long rightChoices = right - index;

                sum += (long) nums[index] * leftChoices * rightChoices;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return sum;
    }
}