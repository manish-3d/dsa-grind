class Solution {
    private static final long mod = 1_000_000_007L;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = (n+1)/2;
        long ans = (power(5,even) * power(4,odd))% mod;
        return (int)(ans);
    }
    public long power(long x , long n ){
            if(n == 0){
                return 1;
            }
            long half = power(x,n/2);
            if(n%2 == 0 ){
                return half*half %mod;
            }
            return ((half*half)%mod)* x %mod;
    }
}