class Solution {
    public int maxProduct(int[] nums) {
        int currmax = nums[0];
        int currmin = nums[0];
        int ans = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
          int max = currmax ;
          int min = currmin ;
          currmax = Math.max(nums[i],Math.max(nums[i]*max ,nums[i]*min));
          currmin = Math.min(nums[i],Math.min(nums[i]*max , nums[i]*min));
          ans = Math.max(ans,currmax);
        }return ans;
}
}