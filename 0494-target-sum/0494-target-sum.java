class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int csum = 0;
        int index = 0;
        int ans =solve(nums,target,index,csum);
        return ans ;
    }
    public int solve(int[]nums,int target,int index,int csum){
        if(index == nums.length ){
            if(csum == target){
                return 1;
            }
            return 0;
        }
       int plus =  solve(nums,target,index+1,csum + nums[index] );
       int minus = solve(nums,target,index+1,csum - nums[index]);
        return plus + minus;
    }
}