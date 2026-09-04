class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int i = 0;
        int j = 0;
        int moves = 0 ;
        while(seats.length>i && j<students.length){
            moves =  moves + Math.max(seats[i],students[j]) - Math.min(seats[i],students[j]);
            i++;
            j++;
        }
        return moves;
    }
}