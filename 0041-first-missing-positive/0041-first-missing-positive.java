class Solution {
    public int firstMissingPositive(int[] nums) {
     int j = 0;
     while(j< nums.length){
        if(nums[j]-1 == j){
            j++;
        }
        else if(nums[j]>=1 && nums[j] <= nums.length && nums[j] != nums[nums[j]-1]){
           int correct = nums[j] - 1;
           int temp = nums[j];
           nums[j] = nums[correct];
           nums[correct] = temp;
        }else{
            j++;
        }
     }
     for(int i = 0; i<nums.length ; i++){
        if(nums[i] != i+1){
            return i+1;
        }
     }
     return nums.length+1;

    }
}