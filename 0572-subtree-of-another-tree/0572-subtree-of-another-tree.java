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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean ans = solveit(root, subRoot);
        return ans;
    }
    public boolean solveit(TreeNode root,TreeNode subRoot){
        if(root== null){
            return false;
        }
        if(issubroot(root,subRoot)){
            return true;
        }
       return solveit(root.left,subRoot) || solveit(root.right,subRoot);
        

    }   
    public boolean issubroot(TreeNode root, TreeNode subroot){
        if( root == null && subroot == null){
            return true;
        }
        if(root == null || subroot == null){
            return false;
        }
        if(root.val != subroot.val){
            return false;
        }
        return issubroot(root.left,subroot.left) && issubroot(root.right,subroot.right);
    }
   
}