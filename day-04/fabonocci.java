class Solution {
    static int nthFibonacci(int n) {
        if(n<=0){
            return n;
        }
        return Math.abs(nthFibonacci(n-1)+nthFibonacci(n-2));
        
        
    }
}
