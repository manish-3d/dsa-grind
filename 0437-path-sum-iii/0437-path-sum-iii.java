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
    int maxum = 0;
    HashMap<Long,Integer> hmap = new  HashMap<>();
    public int pathSum(TreeNode root, int targetsum) {
      
            hmap.put(0L,1);
            solveit(root,targetsum,0L);
            return maxum;
    }
    public void solveit(TreeNode root,int target , long cmax ){
            if(root == null){
                return ;
            }
            
            cmax = cmax + root.val;
            long need = cmax - target;
            if(hmap.containsKey(need)){
                maxum = maxum + hmap.get(need);
            }
            hmap.put(cmax,hmap.getOrDefault(cmax,0)+1);
        solveit(root.left,target,cmax);
        solveit(root.right,target,cmax);
        hmap.put(cmax,hmap.getOrDefault(cmax,0)-1);
    }
}