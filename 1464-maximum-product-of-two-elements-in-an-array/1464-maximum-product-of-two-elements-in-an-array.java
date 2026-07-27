class Solution {
    public int maxProduct(int[] nums) {
      int seclargest = 0;
      int largest = 0;
      for(int i = 0 ; i<nums.length ; i++ ){
         if(nums[i]>largest){
            seclargest = largest;
            largest = nums[i];
         }
         else if(nums[i]<=largest && nums[i]>seclargest){
            seclargest = nums[i];
         }
      }

      return (seclargest-1)*(largest-1);

    }
}