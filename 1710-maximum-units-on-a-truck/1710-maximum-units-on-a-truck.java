class Solution {
    public int maximumUnits(int[][] box, int trucksize) {
        Arrays.sort(box , (a,b)-> Integer.compare(b[1],a[1]));
        int ans = 0;
       for(int i = 0 ; i< box.length ; i++){
        if(trucksize >0){
            if(box[i][0]>=trucksize){
                ans = ans + trucksize * box[i][1];
                trucksize = 0;
            }else{
                ans = ans + box[i][0]* box[i][1];
                trucksize =trucksize -  box[i][0];
            }
        }else{
            break;
        }
    }
    return ans;
    }

}