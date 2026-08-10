class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> subans = new ArrayList<>();
    int index = 0;
    subsetfinder(nums,ans,subans,index);
    return ans;
    }
    public void subsetfinder(int[]nums,List<List<Integer>>ans,List<Integer>subans,int index){
        //base case condition 
        if(index == nums.length){
            ans.add(new ArrayList<>(subans));
            return ;
        }
        subans.add(nums[index]);
        subsetfinder(nums,ans,subans,index+1);
        subans.remove(subans.size() - 1);
        subsetfinder(nums,ans,subans,index+1);
    }
}