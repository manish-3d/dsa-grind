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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        solveit(root,0,ans);
        return ans;
        }
    
    public void solveit(TreeNode root,int level,List<List<Integer>> ans){
        if(root == null ){
            return ;
        }
        if(level == ans.size()){
            ans.add(new ArrayList<>());
        }
        if(level%2 == 0){
            ans.get(level).add(root.val);
        }else{
            ans.get(level).add(0,root.val);
        }
        
        
            solveit(root.left,level+1,ans);
            solveit(root.right,level+1,ans);

    }
}
