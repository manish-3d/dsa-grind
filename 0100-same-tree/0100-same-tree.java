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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean ans = solveit(p,q);
        return ans;
    }
    public boolean solveit(TreeNode p,TreeNode q){
       if(p == null  && q == null){
        return true;
       }
        if(q== null || p == null){
        return false;
       }
       if(q.val != p.val){
        return false;
       }
       return solveit(p.left , q.left) && solveit(p.right , q.right);
    }
}