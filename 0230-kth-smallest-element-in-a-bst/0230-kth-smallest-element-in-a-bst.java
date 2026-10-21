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
    int ans = 0;
    int kth ;
    public int kthSmallest(TreeNode root, int k) {
        this.kth = k;
        solveit(root);
        return ans;
    }
    public void solveit(TreeNode root){
            if(root == null){
                return ;
            }
            
            solveit(root.left);
             kth--; 
            if(kth == 0){
                ans = root.val;
                return ;
            }
            
            solveit(root.right);
            
    }
}