class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        int [] used = new int[nums.length];
        int i = 0;
        for(int num:used){
            used[i++]=0;
        }
        find(ans,index,new ArrayList<>(),nums,used);
        return ans;
    }
    public void find(List<List<Integer>> ans , int index , List<Integer>current , int[]nums ,int []used){
        if(current.size() == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0 ; i<used.length ; i++){
            if(used[i]==1){
                continue;
            }
            used[i]= 1;
            current.add(nums[i]);
            find(ans,index+1,current,nums,used);
            current.remove(current.size()-1);
            used[i]=0;
        }

    }
}