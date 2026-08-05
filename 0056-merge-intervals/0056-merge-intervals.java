class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 1;
        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] > prevEnd){
                count++;
                prevEnd = intervals[i][1];
            } else {
                prevEnd = Math.max(prevEnd, intervals[i][1]);
            }
        }

        int[][] ans = new int[count][2];
        int k = 0;
        ans[k][0] = intervals[0][0];
        ans[k][1] = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            int[] coans = new int[2];
            if(intervals[i][0] <= ans[k][1]){
                coans[0] = ans[k][0];
                coans[1] = Math.max(ans[k][1], intervals[i][1]);
                ans[k] = coans;
            } else {
                k++;
                ans[k] = intervals[i];
            }
        }

        return ans;
    }
}