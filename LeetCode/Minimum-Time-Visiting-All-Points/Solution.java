1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        
4        int totTime = 0;
5
6        for (int i = 1; i < points.length; i++) {
7            int dx = Math.abs(points[i][0] - points[i - 1][0]);
8            int dy = Math.abs(points[i][1] - points[i - 1][1]);
9
10            totTime += Math.max(dx, dy);
11        }
12
13        return totTime;
14    }
15}