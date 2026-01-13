1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int pos = -1;
4        int curr = 0;
5        int total = 0;
6
7        for(int i = 0; i<gas.length; i++) {
8            int diff = gas[i] - cost[i];
9
10            curr += diff;
11            total += diff;
12
13            if(curr<0) {
14                curr = 0;
15                pos = i;
16            }
17        }
18
19        if(total >= 0) {
20            return pos+1;
21        }
22
23        return -1;
24    }
25}