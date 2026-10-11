class Solution {
    static class Info {
        int row;
        int val;

        Info(int row, int val) {
            this.row = row;
            this.val = val;
        }
    }

    int minCol;
    int maxCol;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        minCol = 0;
        maxCol = 0;

        findMinMax(root, 0);

        List<List<Info>> nodes = new ArrayList<>();

        for (int i = 0; i < maxCol - minCol + 1; i++) {
            nodes.add(new ArrayList<>());
        }

        solveit(root, 0, 0, nodes);

        List<List<Integer>> ans = new ArrayList<>();

        for (List<Info> column : nodes) {
            column.sort((a, b) -> {
                if (a.row != b.row) {
                    return Integer.compare(a.row, b.row);
                }
                return Integer.compare(a.val, b.val);
            });

            List<Integer> values = new ArrayList<>();

            for (Info node : column) {
                values.add(node.val);
            }

            ans.add(values);
        }

        return ans;
    }

    void findMinMax(TreeNode root, int col) {
        if (root == null) return;

        minCol = Math.min(minCol, col);
        maxCol = Math.max(maxCol, col);

        findMinMax(root.left, col - 1);
        findMinMax(root.right, col + 1);
    }

    void solveit(TreeNode root, int row, int col,
                 List<List<Info>> nodes) {
        if (root == null) return;

        int index = col - minCol;
        nodes.get(index).add(new Info(row, root.val));

        solveit(root.left, row + 1, col - 1, nodes);
        solveit(root.right, row + 1, col + 1, nodes);
    }
}