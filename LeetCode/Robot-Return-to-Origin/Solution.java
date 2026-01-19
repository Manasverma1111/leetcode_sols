1class Solution {
2    public boolean judgeCircle(String moves) {
3        
4        int vertical = 0;
5        int horizontal = 0;
6
7        for (char ch : moves.toCharArray()) {
8            if (ch == 'U') {
9                vertical++;
10            } else if (ch == 'D') {
11                vertical--;
12            } else if (ch == 'L') {
13                horizontal--;
14            } else {
15                horizontal++;
16            }
17        }
18
19        return (horizontal == 0 && vertical == 0);
20    }
21}