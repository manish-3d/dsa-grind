class Solution {
    public int maxLevelSum(TreeNode root) {
        List<Integer> sum = new ArrayList<>();

        int max = solveit(root, 0, sum);

        return max + 1;
    }

    public int solveit(TreeNode root, int level, List<Integer> sum) {
        if (root == null) {
            return 0;
        }

        if (level >= sum.size()) {
            sum.add(root.val);
        } else {
            sum.set(level, sum.get(level) + root.val);
        }

        solveit(root.left, level + 1, sum);
        solveit(root.right, level + 1, sum);

        // Only calculate max after all level sums are complete
        if (level == 0) {
            int max = 0;

            for (int i = 1; i < sum.size(); i++) {
                if (sum.get(i) > sum.get(max)) {
                    max = i;
                }
            }

            return max;
        }

        return 0;
    }
}