class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N<0){
            N=-N;
            x= 1/x;
        }
        return mypowfinder(x,N);
    }
    public Double mypowfinder(double x , Long N ){
        if(N==0){
            return 1.0;
        }
        Double half = mypowfinder(x,N/2);
        if(N%2==0){
            return half * half ;
        }else {
            return half * half * x;
        }

}
}