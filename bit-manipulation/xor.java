class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int runtime = 1<<nums.length;
        for(int i = 0 ; i < runtime; i++){
             List<Integer> subans = new ArrayList<>();
            for(int j=0 ; j<nums.length ;j++){
                if((i &(1<<j)) !=0){
                    subans.add(nums[j]);
                }
            }
            ans.add(subans);
        }
        return ans;
    }
}