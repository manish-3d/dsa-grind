class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int low = 0 ;
       int ans  = 0;
       for(int high = 0 ; high < nums.length ; high++){
        if(nums[low] ==0 &&  nums[high] ==0){
            low++;
        }else if(nums[high] == 0 ){
            while(low != high+1){
                low++;
            }
        }
        ans = Math.max(ans, high - low + 1);
        
    }
    return ans ;
    
}
}