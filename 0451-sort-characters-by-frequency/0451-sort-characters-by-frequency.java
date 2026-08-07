class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i< s.length() ; i++){
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
        }
       for(int i = 0 ; i<hmap.size();i++){
            int maxchar = 0;
            char max = '\0';
            for(char ch : hmap.keySet()){
                if(hmap.get(ch)>maxchar){
                    max = ch;
                    maxchar = hmap.get(ch);
                }
            }
              while(maxchar !=0){
                    sb.append(max);
                    maxchar--;
                }
                hmap.put(max,0);
        
       }
         return sb.toString();
    }
}
