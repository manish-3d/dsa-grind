class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0 ;
        for(int high = 0; high <nums.length ; high++){
            if(nums[low] != nums[high]){
                nums[++low] = nums[high];
            }
        }
        return low+1;
    }
}