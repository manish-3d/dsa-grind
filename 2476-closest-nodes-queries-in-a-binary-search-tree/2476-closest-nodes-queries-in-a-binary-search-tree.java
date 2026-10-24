
import java.util.*;

class Solution {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> sorted = new ArrayList<>();
        inorder(root, sorted);

        List<List<Integer>> result = new ArrayList<>();

        for (int q : queries) {
            int idx = Collections.binarySearch(sorted, q);

            if (idx >= 0) {
                result.add(Arrays.asList(q, q));
            } else {
                idx = -idx - 1;

                int floor = (idx > 0) ? sorted.get(idx - 1) : -1;
                int ceil = (idx < sorted.size()) ? sorted.get(idx) : -1;

                result.add(Arrays.asList(floor, ceil));
            }
        }

        return result;
    }

    private void inorder(TreeNode root, List<Integer> sorted) {
        if (root == null) return;

        inorder(root.left, sorted);
        sorted.add(root.val);
        inorder(root.right, sorted);
    }
}
