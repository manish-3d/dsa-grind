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
    HashMap<Integer,Integer> hmap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i<inorder.length ; i++){
            hmap.put(inorder[i],i);
        }
         TreeNode ans = new TreeNode();
        return solveit(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
         
    }
    public TreeNode solveit(int[]preorder ,int prstart , int prend ,int[] inorder , int instart , int inend){
        if(prend <prstart || inend <instart){
            return null ;
        }
        int nodevalue = preorder[prstart];
        TreeNode node = new TreeNode(nodevalue);
        int index = hmap.get(preorder[prstart]);
        int detox = index - instart;
        node.left = solveit(preorder ,prstart + 1, prstart + detox,inorder ,instart ,index-1);
        node.right = solveit(preorder ,prstart + detox + 1 ,prend ,inorder, index +1,inend);
        return node;
    }
}