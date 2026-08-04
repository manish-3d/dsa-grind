import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> ans =  new ArrayList<>();
       
     for(int i = 0 ; i<nums.length-2; i++){
      // Skip duplicate first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

       int low  = i+1;
       int high = nums.length-1;
       int currsum = nums[i];
       int fnum = nums[i];
        while(low<high){
            currsum = fnum + nums[low] +  nums[high];
            if(currsum < 0){
                low++;
            }else if ( currsum >0){
                high--;
            }else{
                 List<Integer> curr = new ArrayList<>();
                 curr.add(fnum);
                 curr.add(nums[low]);
                 curr.add(nums[high]);
                 ans.add(curr);
                 low++;
                 high--;
                  // Skip duplicate second element
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    // Skip duplicate third element
                    while (low < high && nums[low] == nums[high +  1]) {
                        high--;
                    }
            }
        }
     }
return ans;
       
    }
}