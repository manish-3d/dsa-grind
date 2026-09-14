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
    public int maxDepth(TreeNode root) {
        int cnt = 0;
       int ans =  solveit(cnt,root);
       return ans/2;
    }
    public int solveit(int cnt ,TreeNode root){
        if(root == null){
            return cnt;
        }
        cnt++;
        int wtsp = solveit(cnt,root.left);
        int insta = solveit(cnt,root.right);
        return (Math.max(wtsp,insta) + 1);
    }
}