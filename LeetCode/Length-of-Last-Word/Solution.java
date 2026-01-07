1class Solution {
2    public int lengthOfLastWord(String s) {
3        
4        int n = s.length() - 1;
5        int len = 0;
6
7        for (int i = n; i >= 0; i--) {
8            if (s.charAt(i) != ' ') {
9                len++;
10            } else if (len > 0) {
11                break;
12            }
13        }
14
15        return len;
16
17    }
18}