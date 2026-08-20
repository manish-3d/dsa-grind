class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int low = 0;
        int high = 0;
        HashMap<Integer,Integer> hmap = new  HashMap<>();
        long sum = 0;
        long maxsum = 0;
        while(high<nums.length){
            hmap.put(nums[high], hmap.getOrDefault(nums[high],0)+1);
            sum = sum + nums[high];
            if(high-low+1 > k){
                sum = sum - nums[low];
                hmap.put(nums[low], hmap.getOrDefault(nums[low],0)-1);
                low++;
            }
            while( hmap.get(nums[high]) >1 && low<=high){
                 hmap.put(nums[low], hmap.getOrDefault(nums[low],0)-1);
                 sum = sum - nums[low];
                 low++;
            }
            if(high-low+1 == k){
                maxsum = Math.max(sum,maxsum);
            }
            high++;
        }
        return maxsum;
    }
}