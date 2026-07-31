class Solution {
    public int maxProfit(int[] nums) {
            int min = Integer.MAX_VALUE ; 
            int maxprofit = 0;
        for(int i = 0 ; i<nums.length ; i++){
            maxprofit = Math.max(nums[i]-min,maxprofit);
            min = Math.min(min,nums[i]);
        }
        if(maxprofit>0){
            return maxprofit;
        }
        return 0;

    }
}