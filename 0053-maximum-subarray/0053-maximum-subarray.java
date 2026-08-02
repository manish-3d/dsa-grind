class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int ansmax = nums[0];
        for(int i = 1; i<nums.length ; i++){
            if(currsum + nums[i] < nums[i]){
                currsum = nums[i];
            }else{
                currsum = currsum + nums[i];
            }
            ansmax = Math.max(currsum,ansmax);
        }
        return ansmax;
    }
}