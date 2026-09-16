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
        return solveit(root,1,0);
        
    }
    public int  solveit(TreeNode root , int level ,int minlen ){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        if(root.left == null && root.right  == null ){
            return level;
        }
    int left =  solveit(root.left , level + 1,minlen);
    int right = solveit(root.right, level + 1,minlen);
    int gang = Math.min(left,right);
    return gang;
    }
}