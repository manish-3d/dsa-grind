class Solution {
    public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare(
    Math.sqrt(b[0] * b[0] + b[1] * b[1]),
    Math.sqrt(a[0] * a[0] + a[1] * a[1])
));
for(int i = 0 ; i<points.length ; i++){
        pq.offer(points[i]);
        if(pq.size()>k){
            pq.poll();
        }
}
    int[][]ans = new int[k][2];
     for(int i = 0 ; i<k ; i++){
        ans[i][0] = pq.peek()[0];
        ans[i][1] = pq.poll()[1];
        }
        return ans;
    }
}