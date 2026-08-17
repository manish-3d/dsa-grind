class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[]leftside = new int[n+1];
        for(int[]booking : bookings){
            int first = booking[0];
            int last= booking[1];
            int seats = booking[2];
            leftside[first-1] += seats;
            leftside[last] -= seats;
        }
       
        int[] ans = new int[n];
        int presum = 0;
        for(int i = 0 ;i<n ; i++){
            presum = presum + leftside[i];
            ans[i] = presum ;
        }
        return ans;
    }
}