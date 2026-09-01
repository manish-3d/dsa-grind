class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hmap =  new HashMap<>();
       int ans = 0;
       for(int i = 0 ; i<wall.size() ; i++){
        int sum = 0;
            for(int j = 0 ; j< wall.get(i).size() -1; j++){
                sum = sum + wall.get(i).get(j);
                
                hmap.put(sum,hmap.getOrDefault(sum,0)+1);
                ans = Math.max(ans,hmap.get(sum));
            }
       }
       return wall.size()-ans;
    }
}