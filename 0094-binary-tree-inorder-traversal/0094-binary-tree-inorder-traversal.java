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
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else {
                node = stack.pop();
                ans.add(node.val);
                node = node.right;

            }  
        }
        return ans;
        
    }
}