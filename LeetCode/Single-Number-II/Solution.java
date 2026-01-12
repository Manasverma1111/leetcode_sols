1import java.util.Scanner;
2
3class Solution {
4    public int singleNumber(int[] nums) {
5        int ones = 0, twos = 0;
6
7        for (int num : nums) {
8            ones = (ones ^ num) & ~twos;
9            twos = (twos ^ num) & ~ones;
10        }
11
12        return ones;
13    }
14}