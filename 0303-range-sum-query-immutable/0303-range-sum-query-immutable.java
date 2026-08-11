class NumArray {
int [] nums ;
int ans ;
    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        int i = 0;
        for(int num : nums){
            this.nums[i++] = num;
        }
    }
    
    public int sumRange(int left, int right) {
        int sum =0;
        while(left<=right){
            if(left==right){
                sum = sum+ nums[left];
            }
            else{sum = sum+ nums[left] + nums[right];}
            left++;
            right--;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */