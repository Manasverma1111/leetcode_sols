1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        
4        List<List<Integer>> result = new ArrayList<>();
5
6        for (int i = 0; i < numRows; i++) {
7            List<Integer> currRow = new ArrayList<>();
8            long value = 1;
9            for (int j = 0; j <= i; j++) {
10                currRow.add((int) value);
11                value = value * (i - j)/(j + 1);
12            }
13
14            result.add(currRow);
15        }
16
17        return result;
18    }
19}