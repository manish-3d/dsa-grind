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
    int max= 0;
    int count = 0;
    List<Integer> ans = new ArrayList<>();
    Integer prev = null;
    public int[] findMode(TreeNode root) {
        solveit(root);
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
    public void solveit(TreeNode root){
        if(root == null){
            return ;
        }
        solveit(root.left);
        if(prev !=null && root.val == prev){
            count++;
        }else{
            count=1;
        }
        prev = root.val;
        if(count > max){
            max = count;
            ans.clear();
            ans.add(prev);
        }else if(count == max){
            ans.add(prev);
        }
        solveit(root.right);
      
    }
}