class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int[]used = new int[nums.length];
        int i = 0 ;
        for(int num : nums){
            used[i++] = 0;
        }
        solveit(ans,0,new ArrayList<>(),nums,used);
        return ans;
    }
        public void solveit(List<List<Integer>> ans, int index ,List<Integer>current,int[] nums,int[]used){
            if(current.size() == nums.length){
                ans.add(new ArrayList<>(current));
                return;
            }
            for(int i = 0; i<nums.length;i++){
                if(used[i]!=0){
                    continue;
                }
                if(i>0 && nums[i]== nums[i-1] && used[i-1]==0){
                    continue;
                }
                used[i] = 1;
                current.add(nums[i]);
                solveit(ans,index+1,current,nums,used);
                current.remove(current.size()-1);
                used[i]= 0;
            }
        
        }
}