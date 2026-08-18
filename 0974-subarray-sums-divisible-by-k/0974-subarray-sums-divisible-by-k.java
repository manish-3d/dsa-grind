class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        int current = 0;
        int count = 0;
        for(int i = 0 ; i<nums.length ; i++){
            current = current + nums[i];
           int needit = ((current % k) + k) % k;
            if(hmap.containsKey(needit)){
                count = count + hmap.get(needit);
            }
                hmap.put(needit ,hmap.getOrDefault(needit,0)+1);
        }
        return count ;
    }
}