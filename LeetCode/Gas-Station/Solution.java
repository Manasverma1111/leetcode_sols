1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        
4        int start = 0;
5        int totalGas = 0;
6        int currGas = 0;
7
8        for (int i = 0; i < gas.length; i++) {
9            int diff = gas[i] - cost[i];
10
11            totalGas += diff;
12            currGas += diff;
13
14            if (currGas < 0) {
15                start = i + 1;
16                currGas = 0;
17            }
18        }
19
20        return (totalGas >= 0) ? start : -1;
21    }
22}