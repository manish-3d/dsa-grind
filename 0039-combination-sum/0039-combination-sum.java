class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(target,candidates,new ArrayList<>(),ans,0,0);
        return ans;


    }
    public void backtrack(int target,int[]candidates , List<Integer> curr , List<List<Integer>> ans , int i , int csum ){
            if(csum == target){
                ans.add(new ArrayList<>(curr));
                return;
            }
            if(i==candidates.length || csum > target){
                return ;
            }
        curr.add(candidates[i]);
        backtrack(target,candidates,curr,ans,i,csum+candidates[i]);
        curr.remove(curr.size()-1);
        backtrack(target,candidates,curr,ans,i+1,csum);
    }
}