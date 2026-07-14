1class Solution {
2    public int findNumbers(int[] nums) {
3        
4        int count = 0;
5        
6        for (int num : nums) {
7            if(isEvenDigits(num)) {
8                count++;
9            }
10        }
11
12        return count;
13    }
14
15    public boolean isEvenDigits(int num) {
16
17        int evenCount = 0;
18
19        while(num > 0) {
20            int dig = num % 10;
21            num /= 10;
22            evenCount++;
23        }
24
25        if (evenCount % 2 == 0) {
26            return true;
27        }
28
29        return false;
30    }
31}