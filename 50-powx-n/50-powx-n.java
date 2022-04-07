class Solution {
    public double power(double x, long n){
        if(n==0) return 1;
        
        double ans = power(x,n/2);
        
        if(n%2==0) return ans*ans;
        else return x*ans*ans;
    }
    
    
    public double myPow(double x, int n) {
        long raiseTo = n;
        if(raiseTo<0){
            raiseTo = (-1)*raiseTo;
        }
        double res = power(x,raiseTo);
        return n<0?(1/res):res;
    }
}