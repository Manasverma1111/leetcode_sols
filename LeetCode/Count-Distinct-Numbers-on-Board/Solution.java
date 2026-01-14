1class Solution {
2    public int distinctIntegers(int n) {
3        
4        Set<Integer> board = new HashSet<>();
5        board.add(n);
6
7        boolean changed = true;
8
9        while (changed) {
10            changed = false;
11            Set<Integer> nextNumbers = new HashSet<>();
12
13            for (int x : board) {
14                for (int i = 1; i <= n; i++) {
15                    if (x % i == 1 && !board.contains(i)) {
16                        nextNumbers.add(i);
17                        changed = true;
18                    }
19                }
20            }
21
22            board.addAll(nextNumbers);
23        }
24
25        return board.size();
26    }
27}