class MedianFinder {
        PriorityQueue<Integer> minheap;
        PriorityQueue<Integer> maxheap;
    public MedianFinder() {
        minheap = new PriorityQueue<>();
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxheap.isEmpty()|| num <= maxheap.peek()){
            maxheap.offer(num);
        }else{
            minheap.offer(num);
        }
         if((maxheap.size()-minheap.size())>1){
            minheap.offer(maxheap.poll());
         }
         else if((minheap.size()-maxheap.size())>1){
            maxheap.offer(minheap.poll());
         }
    }
    
    public double findMedian() {
        if(maxheap.size() == minheap.size() ){
            return (maxheap.peek() + minheap.peek())/2.0 ;
        }else if(maxheap.size()>minheap.size()){
            return (maxheap.peek());
        }else{
            return minheap.peek();
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */