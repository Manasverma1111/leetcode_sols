1class Solution {
2    public int maxProfit(int[] prices) {
3        int lsf = Integer.MAX_VALUE;
4        int op = 0;
5        int pist = 0;
6        
7        for(int i = 0; i < prices.length; i++){
8
9            if(prices[i] < lsf){
10                lsf = prices[i];
11            }else{
12                pist = prices[i] - lsf;
13            }
14
15            if(op < pist){
16                op = pist;
17            }
18        }
19
20        return op;
21    }
22}