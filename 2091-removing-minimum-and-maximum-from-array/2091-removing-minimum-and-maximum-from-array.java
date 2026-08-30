class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minindex = 0;
        int maxindex = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

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

        int p1;
        int p2;

        if (n % 2 == 0) {
            p1 = n / 2 - 1;
            p2 = n / 2;
        } else {
            p1 = n / 2;
            p2 = n / 2;
        }

        int ans = Integer.MAX_VALUE;

        // Both min and max are on the left
        if (minindex <= p1 && maxindex <= p1) {
            int dox = Math.max(minindex, maxindex);
            ans = dox + 1;
        }

        // Both min and max are on the right
        else if (minindex >= p2 && maxindex >= p2) {
            int dox = Math.min(minindex, maxindex);
            ans = n - dox;
        }

        // max is on left, min is on right
        else if (maxindex <= p1 && minindex >= p2) {
            int fromBoth = (maxindex + 1) + (n - minindex);
            int fromLeft = minindex + 1;
            int fromRight = n - maxindex;

            ans = Math.min(fromBoth, Math.min(fromLeft, fromRight));
        }

        // min is on left, max is on right
        else if (minindex <= p1 && maxindex >= p2) {
            int fromBoth = (minindex + 1) + (n - maxindex);
            int fromLeft = maxindex + 1;
            int fromRight = n - minindex;

            ans = Math.min(fromBoth, Math.min(fromLeft, fromRight));
        }

        // One of them is exactly in the middle for odd n
        if (n % 2 != 0) {
            int mid = n / 2;

            if (minindex == mid || maxindex == mid) {
                int fromLeft = Math.max(minindex, maxindex) + 1;
                int fromRight = n - Math.min(minindex, maxindex);

                ans = Math.min(ans, Math.min(fromLeft, fromRight));
            }
        }

        return ans;
    }
}