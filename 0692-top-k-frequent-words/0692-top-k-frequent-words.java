class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i< words.length ; i++){
            hmap.put(words[i],hmap.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b)-> {if(!hmap.get(a).equals(hmap.get(b))){
                return hmap.get(a)-hmap.get(b);
            };
            return b.compareTo(a);
            }
        );
           for(String key : hmap.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
           }
           List<String> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            String frequentword = pq.poll();
                ans.add(frequentword);
        }Collections.reverse(ans);
        return ans;
        
    }
}