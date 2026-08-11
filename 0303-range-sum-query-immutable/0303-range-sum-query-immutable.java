class NumArray {
int [] nums ;
HashMap<Integer,Integer> hmap = new HashMap<>();
    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        int i = 0;
        int prefixsum = 0;
        for(int num : nums){
            this.hmap.put(i,prefixsum);
            prefixsum = prefixsum + num;
            this.nums[i++] = num;
        }
        hmap.put(i,prefixsum);
    }
    
    public int sumRange(int left, int right) {
        int sum =0;
       sum = hmap.get(right+1) - hmap.get(left);
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */