1class Solution {
2    public boolean isPowerOfFour(int n) {
3        
4        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
5    }
6}