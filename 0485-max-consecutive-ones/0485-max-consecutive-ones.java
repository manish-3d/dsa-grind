class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int state = 0 ; 
       int ans = 0;
       for(int i= 0 ; i< nums.length ; i++){
        if(nums[i]==1){
            state++;
        }else if(nums[i]==0){
            state = 0;
        }
        ans = Math.max(ans,state);
 }
 return ans;

}
}