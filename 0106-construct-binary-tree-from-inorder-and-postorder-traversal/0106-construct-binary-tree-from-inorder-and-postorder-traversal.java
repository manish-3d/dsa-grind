class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hmap.put(inorder[i], i);
        }

        return solveit(
            hmap,
            inorder,
            postorder,
            0,
            inorder.length - 1,
            postorder.length - 1,
            0
        );
    }

    public TreeNode solveit(
        HashMap<Integer, Integer> hmap,
        int[] inorder,
        int[] postorder,
        int instart,
        int inend,
        int pstart,
        int pend
    ) {

        if (instart > inend || pstart < pend) {
            return null;
        }

        int nodeval = postorder[pstart];

        TreeNode node = new TreeNode(nodeval);

        int index = hmap.get(nodeval);

        // Number of nodes in right subtree
        int rightSize = inend - index;

        // Left subtree
        node.left = solveit(
            hmap,
            inorder,
            postorder,
            instart,
            index - 1,
            pstart - rightSize - 1,
            pend
        );

        // Right subtree
        node.right = solveit(
            hmap,
            inorder,
            postorder,
            index + 1,
            inend,
            pstart - 1,
            pstart - rightSize
        );

        return node;
    }
}