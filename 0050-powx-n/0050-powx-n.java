class Solution {
    public double myPow(double x, int n) {
        int b=Math.abs(n);
        double res=1.0;
        while(b!=0){
            if(b % 2!=0 ){
                res = res* x;
            }
            
            b=b/2;
            x=x*x;
        }
        if(n<0)
            return 1.0/res;
        return res;
    }
}