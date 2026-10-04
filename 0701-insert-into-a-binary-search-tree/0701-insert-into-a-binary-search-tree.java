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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        solveit(root,val);
        return root;
    }
    public void solveit(TreeNode root,int val ){
        if(root.left == null || root.right == null){
            if(root.left == null && val < root.val){
                TreeNode newNode = new TreeNode(val);
                root.left = newNode;
                return ;
            }
            else if(root.right == null && val > root.val){
                TreeNode newNode = new TreeNode(val);
                root.right = newNode;
                return;
            }
        }
        if(root.val < val){
         solveit(root.right,val);
        }else if(root.val > val){
          solveit(root.left,val);
        }

}
}