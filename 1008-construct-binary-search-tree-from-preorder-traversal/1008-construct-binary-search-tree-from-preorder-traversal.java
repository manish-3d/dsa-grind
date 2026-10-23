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
    public TreeNode bstFromPreorder(int[] preorder) {
        return solveit(preorder , 0 , preorder.length - 1);
    }
    public TreeNode solveit(int[] preorder , int start , int end ){
        if(start > end ){
            return null;
        }
       int root = preorder[start];
       int rightstart = end + 1;
      for(int i= start ;i<=end ; i++){
            if(root < preorder[i]){
                rightstart = i;
                break;
            }
      }
      int leftstart = start+1;
      TreeNode rootnode = new TreeNode(root);
      rootnode.left = solveit(preorder,leftstart,rightstart-1);
      rootnode.right = solveit(preorder,rightstart,end);
      return rootnode;
    }
}