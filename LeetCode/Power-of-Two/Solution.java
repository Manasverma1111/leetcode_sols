1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        
4        // if (n > 0 && ((n & n - 1) == 0)) {
5        //     return true;
6        // }
7
8        if (n <= 0) {
9            return false;
10        }
11
12        return (n & (n - 1)) == 0;
13    }
14}