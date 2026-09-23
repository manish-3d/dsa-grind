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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        solveit(root,targetSum,ans,new ArrayList<>());
        return ans;
    }
    public void solveit(TreeNode root, int target,List<List<Integer>> ans ,List<Integer> litans){
                if(root == null){
                   return;
                   }
                    litans.add(root.val);
                   if(root.right == null && root.left == null){
                     if(target == root.val){
                        ans.add(new ArrayList<>(litans));
                    }
                    litans.remove(litans.size()-1);
                    return;
                }
                solveit(root.left,target-root.val,ans,litans);
                solveit(root.right,target-root.val,ans,litans);
                litans.remove(litans.size()-1);
            
    }
}