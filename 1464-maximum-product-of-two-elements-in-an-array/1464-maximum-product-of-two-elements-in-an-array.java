class Solution {
    public int maxProduct(int[] nums) {
       PriorityQueue<Integer> minheap= new PriorityQueue<>();
       for(int num : nums){
        minheap.offer(num);
        if(minheap.size()>2){
            minheap.poll();
        }
       }
       int a = minheap.poll()-1;
       int b = minheap.poll()-1;
    return a*b;

    }
}