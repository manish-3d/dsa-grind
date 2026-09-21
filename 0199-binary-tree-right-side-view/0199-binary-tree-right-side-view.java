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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        int level = 0;
        if(root == null){
            return ans;
        }
        solveit(root,ans,level);
        return ans;
    }
    public void solveit(TreeNode root,ArrayList<Integer> ans,int level){
            if(root == null){
                return ;
            }
        if(ans.size() == level){
            ans.add(level,root.val);
        }else{
            ans.set(level,root.val);
        }
        solveit(root.left,ans,level+1);
        solveit(root.right,ans,level+1);
    }
}