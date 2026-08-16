class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
      for(int i=0; i<n ; i++){
        if(nums[i]== 0){
            nums[i] = -1;
        }
      }
      HashMap<Integer,Integer> hmap = new HashMap<>();
      hmap.put(0,-1);
      int sum = 0;
      int maxlen = 0;
      for(int i = 0 ; i<n ; i++){
           sum = sum + nums[i];
           if(hmap.containsKey(sum)){
            maxlen = Math.max(i-hmap.get(sum),maxlen);
           }else{
            hmap.put(sum,i);
           }
      }
      return maxlen;
   
    }
}