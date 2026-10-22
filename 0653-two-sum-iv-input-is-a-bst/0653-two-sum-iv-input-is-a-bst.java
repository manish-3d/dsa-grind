/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val,k TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashSet<Integer> hset = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
       return solveit(root, k);
    }
    public boolean solveit(TreeNode root, int k ){
        if(root == null ){
            return false;
        }
        if(hset.contains(k-root.val)){
            return true;
        }
         hset.add(root.val);
        boolean leftside = solveit(root.left,k);
        boolean rightside = solveit(root.right,k);
        return leftside || rightside ;
    }
}