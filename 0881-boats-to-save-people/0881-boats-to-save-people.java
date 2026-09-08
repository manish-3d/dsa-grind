class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int low = 0;
        int high = people.length -1;
        int boat = 0 ;
        Arrays.sort(people);
        while(low <= high){
            if(people[low] + people[high] > limit){
                high--;
                boat++;
            }else{
            low ++ ;
            high--;
            boat++;
            }
        }
        return boat;

    }
}