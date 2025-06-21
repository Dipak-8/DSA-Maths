class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long exp = n;
        if(exp < 0) exp = -1 * exp;
        while(exp > 0) {
            if(exp % 2 != 0) {
                ans = ans * x;
                exp = exp - 1;
            }
            else if(exp % 2 == 0) {
                x = x * x;
                exp = exp / 2;
            }
        }
        if(n < 0)  
            ans = (double) 1.0 / (double) ans;
        return ans;
    }
}