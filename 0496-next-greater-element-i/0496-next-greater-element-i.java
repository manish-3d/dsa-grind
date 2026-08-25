class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0 ; i<nums2.length ; i++){
            int curr = nums2[i];
            if(stack.isEmpty()){
                stack.push(curr);
            }else if (stack.peek()>curr){
                stack.push(curr);
            }else if (stack.peek()<curr){
                while(!stack.isEmpty() && curr > stack.peek()){
                 int comp = stack.pop();
                 hmap.put(comp,curr);
                }
                stack.push(curr);
            }
        }
        while(!stack.isEmpty()){
            hmap.put(stack.pop(),-1);
        }
       
        for(int i = 0 ; i<nums1.length ; i++){
            nums1[i]= hmap.get(nums1[i]);
        }
        return nums1;

    }
}