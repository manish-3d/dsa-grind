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
    long maxwidth=0;
    List<Long> first = new ArrayList<>();
    public int widthOfBinaryTree(TreeNode root) {
        solveit(root,0,0);
        return (int) maxwidth;
    }
    public void solveit(TreeNode root , long index , int level){
        if(root == null){
            return;
        }
        if(first.size() == level ){
            first.add(index);
        }
        long width = index - first.get(level)+1;
        maxwidth = Math.max(width,maxwidth);
        solveit(root.left , 2*index , level +1);
        solveit(root.right , 2*index + 1,level + 1);
        return ;
    }
}