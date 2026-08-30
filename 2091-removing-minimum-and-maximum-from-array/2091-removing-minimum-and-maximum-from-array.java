class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minindex = 0;
        int maxindex = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max indices
        for (int i = 0; i < n; i++) {
            if (nums[i] <= min) {
                min = nums[i];
                minindex = i;
            }

            if (nums[i] >= max) {
                max = nums[i];
                maxindex = i;
            }
        }

        int p1 = (n - 1) / 2;
        int p2 = n / 2;

        int left = Math.min(minindex, maxindex);
        int right = Math.max(minindex, maxindex);

        int ans = Integer.MAX_VALUE;

        // Both are on the left
        if (minindex <= p1 && maxindex <= p1) {
            ans = Math.min(ans, right + 1);
        }

        // Both are on the right
        if (minindex >= p2 && maxindex >= p2) {
            ans = Math.min(ans, n - left);
        }

        // They are on opposite sides
        if (minindex <= p1 && maxindex >= p2) {
            // Remove both from left
            ans = Math.min(ans, right + 1);

            // Remove both from right
            ans = Math.min(ans, n - left);

            // Remove min from left and max from right
            ans = Math.min(ans, minindex + 1 + n - maxindex);
        }

        if (maxindex <= p1 && minindex >= p2) {
            // Remove both from left
            ans = Math.min(ans, right + 1);

            // Remove both from right
            ans = Math.min(ans, n - left);

            // Remove max from left and min from right
            ans = Math.min(ans, maxindex + 1 + n - minindex);
        }

        // Odd n: middle element
        if (n % 2 != 0) {
            int mid = n / 2;

            if (minindex == mid || maxindex == mid) {
                ans = Math.min(ans, right + 1);
                ans = Math.min(ans, n - left);
            }
        }

        return ans;
    }
}