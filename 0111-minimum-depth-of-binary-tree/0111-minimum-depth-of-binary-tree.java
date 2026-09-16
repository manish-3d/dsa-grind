/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
    int ans = solveit(root,1);
    return ans;
    }
    public int solveit(TreeNode root , int level ){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        if(root.right == null && root.left == null){
            return level;
        }
        int left = solveit(root.left , level + 1);
        int right = solveit(root.right , level + 1);
        return Math.min(left,right);
    }

}