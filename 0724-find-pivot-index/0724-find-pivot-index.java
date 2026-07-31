class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0 ;
        int lsum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            sum = sum + nums[i];
        }
        
        for(int i = 0 ; i<nums.length ; i++){
            if((sum-lsum)-nums[i] == lsum){
                return i;
            }
            lsum = lsum + nums[i];
        }
        return -1;
    }
}