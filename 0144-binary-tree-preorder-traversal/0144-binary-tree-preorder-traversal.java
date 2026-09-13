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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
       solveit(root,ans);
       return ans;
    }
    public void solveit(TreeNode root , List<Integer> ans ){
        //base condition 
        if(root == null){
            return;
        }
        ans.add(root.val);
        solveit(root.left,ans);
        solveit(root.right,ans);
    }
}