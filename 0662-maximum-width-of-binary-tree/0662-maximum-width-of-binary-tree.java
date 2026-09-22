class Solution {

    long maxWidth = 0;
    List<Long> first = new ArrayList<>();

    public int widthOfBinaryTree(TreeNode root) {
        solve(root, 0, 0);
        return (int) maxWidth;
    }

    private void solve(TreeNode root, long index, int level) {

        if (root == null) return;

        // First/leftmost node of this level
        if (level == first.size()) {
            first.add(index);
        }

        // Width of current node's level
        long width = index - first.get(level) + 1;
        maxWidth = Math.max(maxWidth, width);

        // Complete binary tree indexing
        solve(root.left, 2 * index, level + 1);
        solve(root.right, 2 * index + 1, level + 1);
    }
}