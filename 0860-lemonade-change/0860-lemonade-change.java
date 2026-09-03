class Solution {
    public boolean lemonadeChange(int[] nums) {
       int ten = 0;
       int five = 0;
       for(int i = 0 ; i<nums.length ; i++){
        if(nums[i] == 5){
            five++;
        }else if (nums[i] == 10){
            if(five >= 1){
                five--;
                ten++;
            }else{
                return false;
            }
        }else if (nums[i] == 20){
            if(five>=1 && ten >= 1){
                five--;
                ten--;
            }
            else if(five >= 3){
                five = five -3;
            }else{
                return false;
            }
        }
       }
       return true;
    }
}