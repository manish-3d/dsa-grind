import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count the frequency of each number
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int num : nums) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap based on frequency
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        // Step 3: Put (number, frequency) into heap
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {

            pq.offer(new int[]{
                entry.getKey(),
                entry.getValue()
            });

            // Keep only k most frequent elements
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Extract answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[0];
        }

        return ans;
    }
}