1class Solution {
2    public int balancedStringSplit(String s) {
3        
4        int balance = 0;
5        int count = 0;
6
7        for (char ch : s.toCharArray()) {
8            if (ch == 'R') {
9                balance++;
10            } else if (ch == 'L') {
11                balance--;
12            }
13
14            if (balance == 0) {
15                count++;
16            }
17        }
18
19        return count;
20    }
21}