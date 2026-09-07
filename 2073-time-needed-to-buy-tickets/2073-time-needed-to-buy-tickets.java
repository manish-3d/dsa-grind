class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int target = t[k];
        int ans = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] > target && i <= k) {
                ans += target;
            } else if (t[i] <= target && i <= k) {
                ans += t[i];
            } else if (t[i] >= target && i > k) {
                ans += target - 1;
            } else if (t[i] < target && i > k) {
                ans += t[i];
            }
        }

        return ans;
    }
}