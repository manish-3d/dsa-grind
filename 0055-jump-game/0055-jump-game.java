class Solution {
    public boolean canJump(int[] nums) {
        int maxjump = 0;
        if(nums.length == 1){
            return true;
        }
        for(int i = 0 ; i<nums.length ; i++){
            maxjump = Math.max(nums[i]+i,maxjump);
            if(i == maxjump && nums[i]==0){
                return false;
            }
            else if(maxjump >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}