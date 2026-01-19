1class Solution {
2    public boolean judgeCircle(String moves) {
3        
4        int vertical = 0;
5        int horizontal = 0;
6
7        for (char move : moves.toCharArray()) {
8            if (move == 'U') {
9                vertical++;
10            } else if (move == 'D') {
11                vertical--;
12            } else if (move == 'L') {
13                horizontal--;
14            } else if (move == 'R') {
15                horizontal++;
16            }
17        }
18
19        return vertical == 0 && horizontal == 0;
20    }
21}