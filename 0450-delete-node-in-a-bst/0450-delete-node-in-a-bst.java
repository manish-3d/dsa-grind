class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            return delete(root);
        }

        solveit(root, key);
        return root;
    }

    public void solveit(TreeNode root, int key) {
        if (root == null) return;
        if (root.left != null && root.left.val == key) {
            root.left = delete(root.left);
            return;
        }
        if (root.right != null && root.right.val == key) {
            root.right = delete(root.right);
            return;
        }

        if (key < root.val) {
            solveit(root.left, key);
        } else {
            solveit(root.right, key);
        }
    }

    private TreeNode delete(TreeNode root) {
        // 0 children
        if (root.left == null && root.right == null) {
            return null;
        }

        // Only right child
        if (root.left == null) {
            return root.right;
        }

        // Only left child
        if (root.right == null) {
            return root.left;
        }

        // 2 children → predecessor
        TreeNode predParent = root;
        TreeNode pred = root.left;

        while (pred.right != null) {
            predParent = pred;
            pred = pred.right;
        }

        root.val = pred.val;

        if (predParent.right == pred) {
            predParent.right = pred.left;
        } else {
            predParent.left = pred.left;
        }

        return root;
    }
}