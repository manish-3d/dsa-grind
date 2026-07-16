class Solution {
    public int oohyeah(int[] nums, int k) {
        int low = 0 ;
        int count = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int high =0 ; high<nums.length ; high++ ){
            hmap.put(nums[high],hmap.getOrDefault(nums[high],0)+1);
            while(hmap.size()>k){
                hmap.put(nums[low],hmap.get(nums[low])-1);
                if(hmap.get(nums[low])==0){
                    hmap.remove(nums[low]);
                }
                low++;
            }
            count = count + high - low + 1 ;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
      int ans =  oohyeah(nums,k)-oohyeah(nums,k-1);
      return ans;
    }
}